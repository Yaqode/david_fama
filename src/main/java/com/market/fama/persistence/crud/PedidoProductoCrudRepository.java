package com.market.fama.persistence.crud;

import com.market.fama.persistence.entity.PedidoProducto;
import com.market.fama.persistence.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface PedidoProductoCrudRepository extends CrudRepository<PedidoProducto, Integer> {
}