package com.market.fama.persistence.mapper;

import com.market.fama.domain.Colony;
import com.market.fama.persistence.entity.Categoria;
import com.market.fama.persistence.entity.Colonia;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper (componentModel = "spring")
public interface ColoniaMapper {
    @Mappings({
            @Mapping(source = "idcolonia", target = "coloniaId"),
            @Mapping(source = "nombre_colonia", target = "nombre"),
    })
    Colony toColony(Colonia colonia);
    List<Colony> toColonys(List<Colony> colonies);


    @InheritInverseConfiguration
    @Mapping(target = "direccions", ignore = true)
    Colonia toColonia(Colony colony);
}
