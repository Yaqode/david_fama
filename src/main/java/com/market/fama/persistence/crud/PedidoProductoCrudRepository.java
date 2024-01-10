package com.market.fama.persistence.crud;

import com.market.fama.persistence.entity.PedidoProducto;
import com.market.fama.persistence.entity.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PedidoProductoCrudRepository extends CrudRepository<PedidoProducto, Integer> {
    @Query("SELECT pp FROM PedidoProducto pp WHERE pp.pedido.usuario.idUsuario = :usuarioId AND pp.pedido.activoPedido = true")
    List<PedidoProducto> findPedidoProductosActivosByUsuarioId(@Param("usuarioId") Integer usuarioId);
}