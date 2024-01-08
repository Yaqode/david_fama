package com.market.fama.persistence.mapper;

import com.market.fama.domain.Buy;
import com.market.fama.domain.Colony;
import com.market.fama.domain.Order;
import com.market.fama.persistence.entity.Colonia;
import com.market.fama.persistence.entity.Compra;
import com.market.fama.persistence.entity.Pedido;
import jakarta.persistence.*;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Date;
import java.util.List;

@Mapper(componentModel = "spring")//, uses = {PedidoMapper.class})
public interface CompraMapper {
    @Mappings({
            @Mapping(source = "idCompra", target = "buyId"),
            @Mapping(source = "claveTransaccionPaypal", target = "transactionKeyPaypal"),
            @Mapping(source = "fechaCompra", target = "buyDate"),
            @Mapping(source = "idPedido", target = "orderId"),
            //@Mapping(source = "pedido", target = "order"),
    })
    Buy toBuy(Compra compra);
    List<Buy> toBuy(List<Compra> compras);

    @InheritInverseConfiguration
    Compra toCompra(Buy buy);
}