package com.market.fama.domain.service;

import com.market.fama.domain.Order;
import com.market.fama.domain.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository OrderRepository;

    public List<Order> getAll() {
        return OrderRepository.getAll();
    }

    public Optional<Order> getOrder(int OrderId) {
        return OrderRepository.getOrder(OrderId);
    }

    public Order save(Order Order) {
        return OrderRepository.save(Order);
    }

    public boolean delete(int OrderId) {
        return getOrder(OrderId).map(Order -> {
            OrderRepository.delete(OrderId);
            return true;
        }).orElse(false);
    }
}
