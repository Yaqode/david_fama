package com.market.fama.persistence.mapper;

import com.market.fama.domain.Colony;
import com.market.fama.domain.Order;
import com.market.fama.domain.Status;
import com.market.fama.domain.StatusOrder;
import com.market.fama.persistence.entity.Colonia;
import com.market.fama.persistence.entity.Estatus;
import com.market.fama.persistence.entity.EstatusPedido;
import com.market.fama.persistence.entity.Pedido;
import jakarta.persistence.*;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Date;
import java.util.List;

@Mapper(componentModel = "spring", uses = {EstatusMapper.class})
public interface EstatusPedidoMapper {
    @Mappings({
            @Mapping(source = "idEstatusPedido", target = "orderStatusId"),
            @Mapping(source = "idEstatus", target = "statusId"),
            @Mapping(source = "idPedido", target = "orderId"),
            @Mapping(source = "activoEstatusPedido", target = "activeStatusOrder"),
            @Mapping(source = "fechaCambioEstatusPedido", target = "dateChangeStatusOrder"),
            @Mapping(source = "estatus", target = "status"),
            //@Mapping(source = "pedido", target = "order"),
    })
    StatusOrder toStatusOrder(EstatusPedido estatusPedido);
    List<StatusOrder> toStatusOrder(List<EstatusPedido> estatusPedidos);

    @InheritInverseConfiguration
    EstatusPedido toEstatusPedido(StatusOrder statusOrder);
}