package com.market.fama.persistence.mapper;

import com.market.fama.domain.Address;
import com.market.fama.persistence.entity.Direccion;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper (componentModel = "spring", uses = {ColoniaMapper.class})
public interface DireccionMapper {
    @Mappings({
            @Mapping(source = "iddireccion", target = "direccionId"),
            @Mapping(source = "calledireccion", target = "calledireccion"),
            @Mapping(source = "nointdireccion", target = "nointdireccion"),
            @Mapping(source = "noextdireccion", target = "noextdireccion"),
            @Mapping(source = "cpdireccion", target = "cpdireccion"),
            @Mapping(source = "referencia_direccion", target = "referenciadireccion"),
            @Mapping(source = "colonia", target = "colony")

    })
    Address toAddress(Direccion direccion);
    List<Address> toAddress(List<Direccion> direccions);

    @InheritInverseConfiguration
    @Mapping(target = "pedidos", ignore = true)
    @Mapping(target = "direccionUsuarios", ignore = true)
    Direccion toDireccion(Address address);
}
