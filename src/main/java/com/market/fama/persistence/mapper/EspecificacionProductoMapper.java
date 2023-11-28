package com.market.fama.persistence.mapper;

import com.market.fama.domain.Productspecification;
import com.market.fama.persistence.entity.EspecificacionProducto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper (componentModel = "spring", uses = {ProductoMapper.class, EspecificacionMapper.class})
public interface EspecificacionProductoMapper {
    @Mappings({
            @Mapping(source = "idespecificacion_producto", target = "especificacionproductoId"),
            @Mapping(source = "especificacion", target = "specification"),
            @Mapping(source = "producto", target = "product")
    })
    Productspecification toProductsspecification(EspecificacionProducto especificacionProducto);
    List<Productspecification> toProductsspecification(List<EspecificacionProducto> especificacionProductos);


    @InheritInverseConfiguration
    EspecificacionProducto toEspecificacionproducto(Productspecification productspecification);
}
