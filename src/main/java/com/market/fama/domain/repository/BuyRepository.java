package com.market.fama.domain.repository;

import com.market.fama.domain.Brand;
import com.market.fama.domain.Buy;

import java.util.List;
import java.util.Optional;

public interface BuyRepository {
    List<Buy> getAll();
    List<Buy> getConfirmadas();
    Optional<Buy> getBuy(int buyId);
    Buy save(Buy buy);
    void delete(int buyId);
}
