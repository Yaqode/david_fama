package com.market.fama.persistence.mapper;

import com.market.fama.domain.Category;
import com.market.fama.domain.Family;
import com.market.fama.persistence.entity.Categoria;
import com.market.fama.persistence.entity.Familia;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FamilyMapper {
    @Mappings({
            @Mapping(source = "idFamilia", target = "familyId"),
            @Mapping(source = "nombreFamilia", target = "nameFamily")
    })
    Family toFamily(Familia familia);
    List<Family> toFamilies(List<Familia> familias);

    @InheritInverseConfiguration
    @Mapping(target = "categorias", ignore = true)
    Familia toFamilia(Family family);
}