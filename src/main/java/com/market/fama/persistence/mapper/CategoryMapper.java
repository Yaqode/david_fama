package com.market.fama.persistence.mapper;

import com.market.fama.domain.Category;
import com.market.fama.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;


@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "nombreCategoria", target = "nameCategory"),
            @Mapping(source = "idFamilia", target = "familyId"),
            @Mapping(source = "familia", target = "family")
    })
    Category toCategory(Categoria categoria);
    List<Category> toCategories(List<Categoria> categoriaList);

    @InheritInverseConfiguration
    @Mapping(target = "subcategorias", ignore = true)
    Categoria toCategoria(Category category);
}