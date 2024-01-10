package com.market.fama.persistence;

import com.market.fama.domain.Profile;
import com.market.fama.domain.User;
import com.market.fama.domain.repository.UserRepository;
import com.market.fama.domain.service.UserService;
import com.market.fama.persistence.crud.RolCrudRepository;
import com.market.fama.persistence.crud.UsuarioCrudRepository;
import com.market.fama.persistence.entity.Rol;
import com.market.fama.persistence.entity.Usuario;
import com.market.fama.persistence.mapper.RolMapper;
import com.market.fama.persistence.mapper.UsuarioMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UsuarioRepository implements UserRepository {
    @Autowired
    private UsuarioCrudRepository usuarioCrudRepository;
    @Autowired
    private UsuarioMapper mapper;
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);
    @Override
    public List<User> getAll() {
        List<Usuario> usuarios = (List<Usuario>) usuarioCrudRepository.findAll();
        return mapper.toUsers(usuarios);
    }

    @Override
    public Optional<User> getUser(int userId) {
        return usuarioCrudRepository.findById(userId).map(usuario -> mapper.toUser(usuario));
    }

    @Override
    public User save(User user) {
        logger.info("Este repo " + user.getUserPassword());
        Usuario usuario = mapper.toUsuario(user);
        logger.info("Este repo " + usuario.getContraseniaUsuario());
        usuario.setContraseniaUsuario(user.getUserPassword());
        return mapper.toUser(usuarioCrudRepository.save(usuario));
    }

    @Override
    public void delete(int userId) {
        usuarioCrudRepository.deleteById(userId);
    }

    @Override
    public User findByCorreoUsuario(String usuario) {
        Usuario usuario1 = usuarioCrudRepository.findByCorreoUsuario(usuario);
        return mapper.toUser(usuario1);
    }
}
