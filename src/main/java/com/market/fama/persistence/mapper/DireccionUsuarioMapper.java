package com.market.fama.persistence.mapper;

import com.market.fama.domain.Useraddress;
import com.market.fama.persistence.entity.DireccionUsuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper (componentModel = "spring", uses = {PersonaMapper.class, DireccionMapper.class})
public interface DireccionUsuarioMapper {
    @Mappings({
            @Mapping(source = "iddireccionusuario", target = "direccionusuarioId"),
            @Mapping(source = "direccion", target = "address"),
            @Mapping(source = "persona", target = "person")
    })
    Useraddress toUseraddress(DireccionUsuario direccionUsuario);
    List<Useraddress> toUseraddress(List<DireccionUsuario> direccionUsuarios);

    @InheritInverseConfiguration
    DireccionUsuario toDireccionusuario(Useraddress useraddress);
}
