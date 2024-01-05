package com.market.fama.persistence.mapper;

import com.market.fama.domain.*;
import com.market.fama.persistence.entity.*;
import jakarta.persistence.*;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PersonaMapper.class, RolMapper.class, DireccionMapper.class})
public interface UsuarioMapper {
    @Mappings({
            @Mapping(source = "idUsuario", target = "userId"),
            @Mapping(source = "correoUsuario", target = "userEmail"),
            @Mapping(source = "nombreUsuario", target = "userName"),
            @Mapping(source = "contraseniaUsuario", target = "userPassword"),
            @Mapping(source = "idRol", target = "profileId"),
            @Mapping(source = "idPersona", target = "personId"),
            @Mapping(source = "rol", target = "profile"),
            @Mapping(source = "persona", target = "person"),
            @Mapping(source = "direcciones", target = "directions"),

    })
    User toUser(Usuario usuario);
    List<User> toUsers(List<Usuario> usuarios);

    @InheritInverseConfiguration
    @Mapping(target = "contraseniaUsuario", ignore = true)
    Usuario toUsuario(User user);
}