package com.market.fama.domain.service;

import com.market.fama.domain.Buy;
import com.market.fama.domain.repository.BuyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BuyService {
    @Autowired
    private BuyRepository BuyRepository;

    public List<Buy> getAll() {
        return BuyRepository.getAll();
    }

    public List<Buy> getConfirmadas() {
        return BuyRepository.getConfirmadas();
    }

    public Optional<Buy> getBuy(int BuyId) {
        return BuyRepository.getBuy(BuyId);
    }

    public Buy save(Buy Buy) {
        return BuyRepository.save(Buy);
    }

    public boolean delete(int BuyId) {
        return getBuy(BuyId).map(Buy -> {
            BuyRepository.delete(BuyId);
            return true;
        }).orElse(false);
    }
}
