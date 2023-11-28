package com.market.fama.persistence.mapper;

import com.market.fama.domain.Brand;
import com.market.fama.persistence.entity.Marca;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper (componentModel = "spring")
public interface MarcaMapper {
    @Mappings({
            @Mapping(source = "idmarca", target = "marcaId"),
            @Mapping(source = "nombremarca", target = "nombremarca"),
            @Mapping(source = "rutaimagen", target = "rutaimagen")
    })
    Brand toBrand(Marca marca);
    List<Brand> toBrand(List<Marca> marcas);


    @InheritInverseConfiguration
    @Mapping(target = "submarcas", ignore = true)
    Marca toMarca(Brand brand);
}
