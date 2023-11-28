package com.market.fama.persistence.mapper;

import com.market.fama.domain.Subbrand;
import com.market.fama.persistence.entity.Submarca;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper (componentModel = "spring", uses = {MarcaMapper.class})
public interface SubmarcaMapper {
    @Mappings({
            @Mapping(source = "idsubmarca", target = "submarcaId"),
            @Mapping(source = "nombremarca", target = "nombremarca"),
            @Mapping(source = "rutaimagen", target = "rutaimagen"),
            @Mapping(source = "marca", target = "brand")
    })
    Subbrand toSubbrand(Submarca submarca);
    List<Subbrand> toSubbrand(List<Submarca> submarcas);

    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Submarca toSubmarca(Subbrand subbrand);
}
