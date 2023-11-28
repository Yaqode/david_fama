package com.market.fama.persistence.mapper;


import com.market.fama.domain.Family;
import com.market.fama.persistence.entity.Familia;
import jakarta.persistence.OneToMany;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper (componentModel = "spring")
public interface FamiliaMapper {
    @Mappings({
            @Mapping(source = "idfamilia", target = "familiaId"),
            @Mapping(source = "nombrefamilia", target = "nombre")
    })
    Family toFamily(Familia familia);
    List<Family> toFamily(List<Familia> familias);

    @InheritInverseConfiguration
    @OneToMany(mappedBy = "categorias")
    Familia toFamilia(Family family);
}
