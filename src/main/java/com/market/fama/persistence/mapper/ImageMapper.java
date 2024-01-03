package com.market.fama.persistence.mapper;

import com.market.fama.domain.Brand;
import com.market.fama.domain.Image;
import com.market.fama.persistence.entity.Imagen;
import com.market.fama.persistence.entity.Marca;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ImageMapper {
    @Mappings({
            @Mapping(source = "idImagen", target = "imageId"),
            @Mapping(source = "rutaImagen", target = "imageRoute"),
            @Mapping(source = "idProducto", target = "productId"),
            @Mapping(source = "noOrden", target = "ordenNo"),
            @Mapping(source = "imagenes", target = "imagens"),
    })
    Image toImage(Imagen imagen);
    List<Image> toImage(List<Imagen> imagenes);

    @InheritInverseConfiguration
    @Mapping(target = "imagenes", ignore = true)
    Imagen toImagen(Image image);
}