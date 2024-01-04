package com.market.fama.persistence.mapper;

import com.market.fama.domain.Colony;
import com.market.fama.domain.Direction;
import com.market.fama.persistence.entity.Colonia;
import com.market.fama.persistence.entity.Direccion;
import jakarta.persistence.*;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ColoniaMapper {
    @Mappings({
            @Mapping(source = "idColonia", target = "colonyId"),
            @Mapping(source = "nombreColonia", target = "nameColony"),
            @Mapping(source = "direcciones", target = "directions"),
    })
    Colony toColony(Colonia colonia);
    List<Colony> toColony(List<Colonia> colonias);

    @InheritInverseConfiguration
    Colonia toColonia(Colony colony);
}