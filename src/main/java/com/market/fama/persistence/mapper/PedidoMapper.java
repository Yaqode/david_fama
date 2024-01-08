package com.market.fama.persistence.mapper;

import com.market.fama.domain.*;
import com.market.fama.persistence.entity.*;
import com.market.fama.persistence.entity.PedidoProducto;
import jakarta.persistence.*;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Date;
import java.util.List;

@Mapper(componentModel = "spring", uses = {UsuarioMapper.class, EstatusPedidoMapper.class, DireccionMapper.class, PedidoProductoMapper.class})
public interface PedidoMapper {
    @Mappings({
            @Mapping(source = "idPedido", target = "orderId"),
            @Mapping(source = "totalPedido", target = "orderTotal"),
            @Mapping(source = "activoPedido", target = "activeOrder"),
            @Mapping(source = "fechaCreacionPedido", target = "dateCreationOrder"),
            @Mapping(source = "instruccionesEntregaPedido", target = "instructionDeliveryOrder"),
            @Mapping(source = "fechaEntregaPedido", target = "dateDeliveryOrder"),
            @Mapping(source = "idDireccionEntregaPedido", target = "deliveryOrderDirectionId"),
            @Mapping(source = "idUsuario", target = "userId"),
            @Mapping(source = "compra", target = "buy"),
            @Mapping(source = "pedidoProducto", target = "orderProduct"),
            @Mapping(source = "estatusPedido", target = "statusOrder"),
            @Mapping(source = "usuario", target = "user"),
    })
    Order toOrder(Pedido pedido);
    List<Order> toOrders(List<Pedido> pedidos);

    @InheritInverseConfiguration
    Pedido toPedido(Order order);
}