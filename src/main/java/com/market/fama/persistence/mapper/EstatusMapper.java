package com.market.fama.persistence.mapper;

import com.market.fama.domain.Colony;
import com.market.fama.domain.Status;
import com.market.fama.domain.StatusOrder;
import com.market.fama.persistence.entity.Colonia;
import com.market.fama.persistence.entity.Estatus;
import com.market.fama.persistence.entity.EstatusPedido;
import jakarta.persistence.*;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")//, uses = {EstatusPedidoMapper.class})
public interface EstatusMapper {
    @Mappings({
            @Mapping(source = "idEstatus", target = "statusId"),
            @Mapping(source = "nombreEstatus", target = "statusName"),
            @Mapping(source = "descripcionEstatus", target = "statusDescription"),
            @Mapping(source = "noStatus", target = "noStatus"),
            //@Mapping(source = "estatusPedido", target = "orderStatus"),
    })
    Status toStatus(Estatus estatus);
    List<Status> toStatus(List<Estatus> estatuses);

    @InheritInverseConfiguration
    Estatus toEstatus(Status status);
}