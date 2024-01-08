package com.market.fama.persistence.crud;

import com.market.fama.persistence.entity.Pedido;
import com.market.fama.persistence.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface PedidoCrudRepository extends CrudRepository<Pedido, Integer> {

}