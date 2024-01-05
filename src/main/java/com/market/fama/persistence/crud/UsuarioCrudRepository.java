package com.market.fama.persistence.crud;

import com.market.fama.domain.User;
import com.market.fama.persistence.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioCrudRepository extends CrudRepository<Usuario, Integer> {
    Usuario findByCorreoUsuario(String user);
}
