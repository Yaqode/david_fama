package com.market.fama.domain.service;

import com.market.fama.domain.OrderProduct;
import com.market.fama.domain.repository.OrderProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderProductService {
    @Autowired
    private OrderProductRepository OrderProductRepository;

    public List<OrderProduct> getAll() {
        return OrderProductRepository.getAll();
    }

    public Optional<OrderProduct> getOrderProduct(int OrderProductId) {
        return OrderProductRepository.getOrderProduct(OrderProductId);
    }

    public OrderProduct save(OrderProduct OrderProduct) {
        return OrderProductRepository.save(OrderProduct);
    }

    public boolean delete(int OrderProductId) {
        return getOrderProduct(OrderProductId).map(OrderProduct -> {
            OrderProductRepository.delete(OrderProductId);
            return true;
        }).orElse(false);
    }
}
