package com.market.fama.persistence.mapper;


import com.market.fama.domain.Status;
import com.market.fama.persistence.entity.Estatus;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper (componentModel = "spring")
public interface EstatusMapper {
    @Mappings({
            @Mapping(source = "idestatus", target = "estatusId"),
            @Mapping(source = "nombreestatus", target = "nombreestatus"),
            @Mapping(source = "descripcionestatus", target = "descripcionestatus"),
            @Mapping(source = "no_status", target = "nostatus"),
    })
    Status toStatus(Estatus estatus);
    List<Status> toStatus(List<Estatus> estatuses);

    @InheritInverseConfiguration
    @Mapping(target = "estatusPedidos", ignore = true)
    Estatus toEstatus(Status status);
}
