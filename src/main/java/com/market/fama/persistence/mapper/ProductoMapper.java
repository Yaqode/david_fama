package com.market.fama.persistence.mapper;

import com.market.fama.domain.Product;
import com.market.fama.persistence.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper (componentModel = "spring", uses = {SubcategoriaMapper.class, SubmarcaMapper.class})
public interface ProductoMapper {
    @Mappings({
            @Mapping(source = "idproducto", target = "productoId"),
            @Mapping(source = "nombreproducto", target = "nombreproducto"),
            @Mapping(source = "descripcionproducto", target = "descripcionproducto"),
            @Mapping(source = "precioproducto", target = "precioproducto"),
            @Mapping(source = "preciodescuentoproducto", target = "preciodescuentoproducto"),
            @Mapping(source = "codigobarrasproducto", target = "codigobarrasproducto"),
            @Mapping(source = "codigointernoproducto", target = "codigointernoproducto"),
            @Mapping(source = "cantidadproducto", target = "cantidadproducto"),
            @Mapping(source = "subcategoria", target = "subcategory"),
            @Mapping(source = "submarca", target = "subbrand")
    })
    Product toProduct(Producto producto);
    List<Product> toProduct(List<Producto> productos);

    @InheritInverseConfiguration
    @Mapping(target = "especificacionProductos", ignore = true)
    @Mapping(target = "imagens", ignore = true)
    @Mapping(target = "inventarios", ignore = true)
    @Mapping(target = "pedidoProductos", ignore = true)
    Producto toProducto(Product product);
}
