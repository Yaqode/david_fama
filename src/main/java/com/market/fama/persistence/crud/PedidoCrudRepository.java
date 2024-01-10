package com.market.fama.persistence.crud;

import com.market.fama.persistence.entity.Pedido;
import com.market.fama.persistence.entity.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PedidoCrudRepository extends CrudRepository<Pedido, Integer> {

    // Define la consulta JPQL para obtener pedidos activos por usuario
    //@Query("SELECT p FROM Pedido p WHERE p.idUsuario = :usuarioId AND p.activoPedido = true")
    //Pedido findActivosByUsuario(@Param("usuarioId") Integer usuarioId);
    @Query("SELECT DISTINCT p FROM Pedido p LEFT JOIN FETCH p.pedidoProducto pp WHERE p.usuario.idUsuario = :usuarioId AND p.activoPedido = true")
    List<Pedido> findPedidosActivosByUsuarioId(@Param("usuarioId") Integer usuarioId);


}