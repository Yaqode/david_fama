package com.market.fama.persistence.mapper;

import com.market.fama.domain.Subcategory;
import com.market.fama.persistence.entity.Subcategoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SubcategoryMapper {
    @Mappings({
            @Mapping(source = "idSubcategoria", target = "subCategoryId"),
            @Mapping(source = "nombreSubcategoria", target = "nameSubCategory"),
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "categoria", target = "category")
    })
    Subcategory toSubcategory(Subcategoria subcategoria);
    List<Subcategory> toSubcategories(List<Subcategoria> subcategorias);

    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Subcategoria toSubcategoria(Subcategory subcategory);
}