package com.market.fama.web.controller;

import com.market.fama.domain.Buy;
import com.market.fama.domain.Order;
import com.market.fama.domain.service.BuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/compras")
public class BuyController {

    @Autowired
    private BuyService BuyService;

    @GetMapping("/all")
    public List<Buy> getAll() {
        return BuyService.getAll();
    }

    @GetMapping("/{BuyId}")
    public Optional<Buy> getBuy(@PathVariable("BuyId") int BuyId) {
        return BuyService.getBuy(BuyId);
    }

    @GetMapping("/confirmadas")
    public List<Buy> getConfirmadas() {
        return BuyService.getConfirmadas();
    }

    @PostMapping("/save")
    public Buy save(@RequestBody Buy Buy) {
        return BuyService.save(Buy);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int BuyId) {
        return BuyService.delete(BuyId);
    }
}