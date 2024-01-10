package com.market.fama.persistence.mapper;

import com.market.fama.domain.Colony;
import com.market.fama.domain.Order;
import com.market.fama.domain.OrderProduct;
import com.market.fama.domain.Product;
import com.market.fama.persistence.entity.Colonia;
import com.market.fama.persistence.entity.Pedido;
import com.market.fama.persistence.entity.PedidoProducto;
import com.market.fama.persistence.entity.Producto;
import jakarta.persistence.*;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = { ProductMapper.class})
public interface PedidoProductoMapper {
    @Mappings({
            @Mapping(source = "idPedidoProducto", target = "productOrderId"),
            @Mapping(source = "idPedido", target = "orderId"),
            @Mapping(source = "idProducto", target = "productId"),
            @Mapping(source = "cantidadProducto", target = "amount"),
            //@Mapping(source = "pedido", target = "order"),
            @Mapping(source = "producto", target = "product"),
    })
    OrderProduct toOrderProduct(PedidoProducto pedidoProducto);
    List<OrderProduct> toOrderProduct(List<PedidoProducto> pedidoProductos);

    @InheritInverseConfiguration
    PedidoProducto toPedidoProducto(OrderProduct orderProduct);
}