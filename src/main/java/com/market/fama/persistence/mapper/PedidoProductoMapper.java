package com.market.fama.persistence.mapper;

import com.market.fama.domain.Productorder;
import com.market.fama.persistence.entity.PedidoProducto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper (componentModel = "spring", uses = {ProductoMapper.class, PedidoMapper.class})
public interface PedidoProductoMapper {
    @Mappings({
            @Mapping(source = "idpedidoproducto", target = "pedidoproductoId"),
            @Mapping(source = "producto", target = "product"),
            @Mapping(source = "pedido", target = "order")
    })
    Productorder toProductorder(PedidoProducto pedidoProducto);
    List<Productorder> toProductorder(List<PedidoProducto> pedidoProductos);

    @InheritInverseConfiguration
    PedidoProducto toPedidoproducto(Productorder productOrder);
}
