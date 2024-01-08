package com.market.fama.domain.repository;

import com.market.fama.domain.Brand;
import com.market.fama.domain.StatusOrder;

import java.util.List;
import java.util.Optional;

public interface StatusOrderRepository {
    List<StatusOrder> getAll();
    Optional<StatusOrder> getStatusOrder(int statusOrderId);
    StatusOrder save(StatusOrder statusOrder);
    void delete(int statusOrderId);
}
