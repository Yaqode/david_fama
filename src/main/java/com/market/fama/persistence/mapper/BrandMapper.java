package com.market.fama.persistence.mapper;

import com.market.fama.domain.Brand;
import com.market.fama.domain.Category;
import com.market.fama.persistence.entity.Categoria;
import com.market.fama.persistence.entity.Marca;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;


@Mapper(componentModel = "spring")
public interface BrandMapper {
    @Mappings({
            @Mapping(source = "idMarca", target = "brandId"),
            @Mapping(source = "nombreMarca", target = "nameBrand"),
            @Mapping(source = "rutaImagen", target = "linkImageBrand"),
    })
    Brand toBrand(Marca marca);
    List<Brand> toBrands(List<Marca> marcas);

    @InheritInverseConfiguration
    @Mapping(target = "submarcas", ignore = true)
    Marca toMarca(Brand brand);
}