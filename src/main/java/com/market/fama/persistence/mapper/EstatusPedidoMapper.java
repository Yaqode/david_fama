package com.market.fama.persistence.mapper;

import com.market.fama.domain.Orderstatus;
import com.market.fama.persistence.entity.EstatusPedido;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper (componentModel = "spring", uses = {EstatusMapper.class, PedidoMapper.class})
public interface EstatusPedidoMapper {
    @Mappings({
            @Mapping(source = "idestatuspedido", target = "estatuspedidoId"),
            @Mapping(source = "activoestatuspedido", target = "activoestatuspedido"),
            @Mapping(source = "fecha_cambio_estatus_pedido", target = "fechacambioestatuspedido"),
            @Mapping(source = "estatus", target = "status"),
            @Mapping(source = "pedido", target = "order"),
    })
    Orderstatus toOrderstatus(EstatusPedido estatusPedido);

    @InheritInverseConfiguration
    EstatusPedido toEstatuspedido(Orderstatus orderstatus);
}
