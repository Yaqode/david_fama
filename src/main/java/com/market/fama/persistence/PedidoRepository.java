package com.market.fama.persistence;

import com.market.fama.domain.Order;
import com.market.fama.domain.repository.OrderRepository;
import com.market.fama.persistence.crud.PedidoCrudRepository;
import com.market.fama.persistence.entity.Pedido;
import com.market.fama.persistence.mapper.PedidoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PedidoRepository implements OrderRepository {

    @Autowired
    private PedidoCrudRepository PedidoCrudRepository;
    @Autowired
    private PedidoMapper mapper;

    @Override
    public List<Order> getAll(){
        List<Pedido> Pedidos = (List<Pedido>) PedidoCrudRepository.findAll();
        return mapper.toOrders(Pedidos);
    }

    @Override
    public List<Order> getOrderActiveByIdUser(int idUser){
        List<Pedido> pedidos = PedidoCrudRepository.findPedidosActivosByUsuarioId(idUser);
        return mapper.toOrders(pedidos);
    }

    @Override
    public Optional<Order> getOrder(int OrderId) {
        return PedidoCrudRepository.findById(OrderId).map(Pedido -> mapper.toOrder(Pedido));
    }

    @Override
    public Order save(Order Order) {
        Pedido Pedido = mapper.toPedido(Order);
        return mapper.toOrder(PedidoCrudRepository.save(Pedido));
    }

    @Override
    public void delete(int categoryId) {
        PedidoCrudRepository.deleteById(categoryId);
    }
}