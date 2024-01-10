package com.market.fama.persistence;

import com.market.fama.domain.OrderProduct;
import com.market.fama.domain.repository.OrderProductRepository;
import com.market.fama.persistence.crud.PedidoProductoCrudRepository;
import com.market.fama.persistence.entity.PedidoProducto;
import com.market.fama.persistence.mapper.PedidoProductoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PedidoProductoRepository implements OrderProductRepository {

    @Autowired
    private PedidoProductoCrudRepository PedidoProductoCrudRepository;
    @Autowired
    private PedidoProductoMapper mapper;

    @Override
    public List<OrderProduct> getAll(){
        List<PedidoProducto> PedidoProductos = (List<PedidoProducto>) PedidoProductoCrudRepository.findAll();
        return mapper.toOrderProduct(PedidoProductos);
    }

    @Override
    public List<OrderProduct> findPedidoProductosActivosByUsuarioId(int userId){
        List<PedidoProducto> PedidoProductos = (List<PedidoProducto>) PedidoProductoCrudRepository.findPedidoProductosActivosByUsuarioId(userId);
        return mapper.toOrderProduct(PedidoProductos);
    }

    @Override
    public Optional<OrderProduct> getOrderProduct(int OrderProductId) {
        return PedidoProductoCrudRepository.findById(OrderProductId).map(PedidoProducto -> mapper.toOrderProduct(PedidoProducto));
    }

    @Override
    public OrderProduct save(OrderProduct OrderProduct) {
        PedidoProducto PedidoProducto = mapper.toPedidoProducto(OrderProduct);
        return mapper.toOrderProduct(PedidoProductoCrudRepository.save(PedidoProducto));
    }

    @Override
    public void delete(int categoryId) {
        PedidoProductoCrudRepository.deleteById(categoryId);
    }
}