package com.market.fama.persistence.mapper;

import com.market.fama.domain.Brand;
import com.market.fama.domain.Category;
import com.market.fama.domain.Subbrand;
import com.market.fama.persistence.entity.Categoria;
import com.market.fama.persistence.entity.Marca;
import com.market.fama.persistence.entity.Producto;
import com.market.fama.persistence.entity.Submarca;
import jakarta.persistence.*;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {BrandMapper.class})
public interface SubbrandMapper {
    @Mappings({
            @Mapping(source = "idSubmarca", target = "subBrandId"),
            @Mapping(source = "nombreSubmarca", target = "nameSubBrand"),
            @Mapping(source = "rutaImagen", target = "linkImageSubbrand"),
            @Mapping(source = "idMarca", target = "brandId"),
            @Mapping(source = "marca", target = "brand"),
    })
    Subbrand toSubbrand(Submarca submarca);
    List<Subbrand> toSubbrands(List<Submarca> submarcas);

    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Submarca toSubmarca(Subbrand subbrand);
}