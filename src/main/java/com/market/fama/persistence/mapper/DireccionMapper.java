package com.market.fama.persistence.mapper;

import com.market.fama.domain.Direction;
import com.market.fama.persistence.entity.Direccion;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ColoniaMapper.class})
public interface DireccionMapper {
    @Mappings({
            @Mapping(source = "idDireccion", target = "directionId"),
            @Mapping(source = "calleDireccion", target = "directionStreet"),
            @Mapping(source = "noIntDireccion", target = "noIntDirection"),
            @Mapping(source = "noExtDireccion", target = "noExtDirection"),
            @Mapping(source = "cpDireccion", target = "directionCP"),
            @Mapping(source = "referenciaDireccion", target = "directionReference"),
            @Mapping(source = "idcolonia", target = "colonyId"),
            @Mapping(source = "idUsuario", target = "userId"),
            @Mapping(source = "colonias", target = "colonies"),
            @Mapping(source = "usuario", target = "users"),
    })
    Direction toDirection(Direccion direccion);
    List<Direction> toDirections(List<Direccion> direccion);

    @InheritInverseConfiguration
    Direccion toDireccion(Direction direction);
}