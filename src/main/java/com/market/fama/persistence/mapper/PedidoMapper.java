package com.market.fama.persistence.mapper;

import com.market.fama.domain.Order;
import com.market.fama.persistence.entity.Pedido;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper (componentModel = "spring", uses = {UsuarioMapper.class, DireccionMapper.class})
public interface PedidoMapper {
    @Mappings({
            @Mapping(source = "id_pedido", target = "pedidoId"),
            @Mapping(source = "totalpedido", target = "totalpedido"),
            @Mapping(source = "activo_pedido", target = "activo_pedido"),
            @Mapping(source = "fechacreacionpedido", target = "fechacreacionpedido"),
            @Mapping(source = "instruccionesentregapedido", target = "instruccionesentregapedido"),
            @Mapping(source = "fechaentregapedido", target = "fechaentregapedido"),
            @Mapping(source = "usuario", target = "user"),
            @Mapping(source = "direccion", target = "address"),

    })
    Order toOrder(Pedido pedido);
    List<Order> toOrder(List<Pedido> pedidos);



    @InheritInverseConfiguration
    @Mapping(target = "estatusPedidos", ignore = true)
    @Mapping(target = "pedidoProductos", ignore = true)
    Pedido toPedido(Order order);

}
