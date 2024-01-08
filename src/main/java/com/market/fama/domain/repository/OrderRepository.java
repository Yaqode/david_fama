package com.market.fama.domain.repository;

import com.market.fama.domain.Brand;
import com.market.fama.domain.Order;

import java.util.List;
import java.util.Optional;

public interface OrderRepository {
    List<Order> getAll();
    Optional<Order> getOrder(int orderId);
    Order getOrderActiveByIdUser(int userId);
    Order save(Order order);
    void delete(int orderId);
}
