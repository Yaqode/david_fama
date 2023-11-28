package com.market.fama.persistence.mapper;

import com.market.fama.domain.User;
import com.market.fama.persistence.entity.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper (componentModel = "spring", uses = {RolMapper.class, PersonaMapper.class})
public interface UsuarioMapper {
    @Mappings({
            @Mapping(source = "idusuario", target = "usuarioId"),
            @Mapping(source = "correousuario", target = "correousuario"),
            @Mapping(source = "nombreusuario", target = "nombreusuario"),
            @Mapping(source = "contraseniausuario", target = "contraseniausuario"),
            @Mapping(source = "rol", target = "role"),
            @Mapping(source = "persona", target = "person")
    })
    User toUser(Usuario usuario);
    List<User> toUser(List<Usuario> usuarios);


    @InheritInverseConfiguration
    @Mapping(target = "pedidos", ignore = true)
    @Mapping(target = "inventarios", ignore = true)
    Usuario toUsuario(User user);
}
