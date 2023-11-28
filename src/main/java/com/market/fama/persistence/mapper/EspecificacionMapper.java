package com.market.fama.persistence.mapper;

import com.market.fama.domain.Specification;
import com.market.fama.persistence.entity.Especificacion;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper (componentModel = "spring")
public interface EspecificacionMapper {
    @Mappings({
            @Mapping(source = "idespecificacion", target = "especificacionId"),
            @Mapping(source = "nombreespecificacion", target = "nombreespecificacion"),
            @Mapping(source = "descripcionespecificacion", target = "descripcionespecificacion"),
    })
    Specification toSpecification(Especificacion especificacion);
    List<Specification> toSpecification(List<Especificacion> especificacions);

    @InheritInverseConfiguration
    @Mapping(target = "especificacionProductos", ignore = true)
    Especificacion toEspecificacion(Specification specification);



}
