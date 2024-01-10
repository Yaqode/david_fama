package com.market.fama.domain.repository;

import com.market.fama.domain.Brand;
import com.market.fama.domain.OrderProduct;

import java.util.List;
import java.util.Optional;

public interface OrderProductRepository {
    List<OrderProduct> getAll();
    List<OrderProduct> findPedidoProductosActivosByUsuarioId(int userId);
    Optional<OrderProduct> getOrderProduct(int orderProductId);
    OrderProduct save(OrderProduct orderProduct);
    void delete(int brandId);
}
