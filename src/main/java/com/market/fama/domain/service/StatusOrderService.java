package com.market.fama.domain.service;

import com.market.fama.domain.StatusOrder;
import com.market.fama.domain.repository.StatusOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StatusOrderService {
    @Autowired
    private StatusOrderRepository StatusOrderRepository;

    public List<StatusOrder> getAll() {
        return StatusOrderRepository.getAll();
    }

    public Optional<StatusOrder> getStatusOrder(int StatusOrderId) {
        return StatusOrderRepository.getStatusOrder(StatusOrderId);
    }

    public StatusOrder save(StatusOrder StatusOrder) {
        return StatusOrderRepository.save(StatusOrder);
    }

    public boolean delete(int StatusOrderId) {
        return getStatusOrder(StatusOrderId).map(StatusOrder -> {
            StatusOrderRepository.delete(StatusOrderId);
            return true;
        }).orElse(false);
    }
}
