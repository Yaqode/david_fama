package com.market.fama.persistence.mapper;

import com.market.fama.domain.Profile;
import com.market.fama.persistence.entity.Rol;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RolMapper {
    @Mappings({
            @Mapping(source = "idRol", target = "profileId"),
            @Mapping(source = "nombreRol", target = "profileName"),
            @Mapping(source = "descripcionRol", target = "profileDescription"),
            @Mapping(source = "usuario", target = "user"),
    })
    Profile toProfile(Rol marca);
    List<Profile> toProfiles(List<Rol> marcas);

    @InheritInverseConfiguration
    //@Mapping(target = "submarcas", ignore = true)
    Rol toRol(Profile profile);
}