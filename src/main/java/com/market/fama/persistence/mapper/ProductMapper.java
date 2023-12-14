package com.market.fama.persistence.mapper;

import com.market.fama.domain.*;
import com.market.fama.persistence.entity.*;
import jakarta.persistence.*;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mappings({
            @Mapping(source = "idProducto", target = "productId"),
            @Mapping(source = "nombreProducto", target = "nameProduct"),
            @Mapping(source = "descripcionProducto", target = "descriptionProduct"),
            @Mapping(source = "precioProducto", target = "priceProduct"),
            @Mapping(source = "precioDescuentoProducto", target = "priceDiscountProduct"),
            @Mapping(source = "codigoBarrasProducto", target = "barcodeProduct"),
            @Mapping(source = "codigoInternoProducto", target = "codeInternalProduct"),
            @Mapping(source = "cantidadProducto", target = "amountProduct"),
            @Mapping(source = "idSubcategoria", target = "subcategoryId"),
            @Mapping(source = "subcategoria", target = "subcategory"),
            @Mapping(source = "idSubmarca", target = "subbrandId"),
            @Mapping(source = "submarca", target = "subbrand")
    })
    Product toProduct(Producto producto);
    List<Product> toProducts(List<Producto> productos);

    @InheritInverseConfiguration
    Producto toProducto(Product product);
}