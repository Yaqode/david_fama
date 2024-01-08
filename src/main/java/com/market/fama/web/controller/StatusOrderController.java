package com.market.fama.web.controller;

import com.market.fama.domain.StatusOrder;
import com.market.fama.domain.service.StatusOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estatus_pedido")
public class StatusOrderController {

    @Autowired
    private StatusOrderService StatusOrderService;

    @GetMapping("/all")
    public List<StatusOrder> getAll() {
        return StatusOrderService.getAll();
    }

    @GetMapping("/{StatusOrderId}")
    public Optional<StatusOrder> getStatusOrder(@PathVariable("StatusOrderId") int StatusOrderId) {
        return StatusOrderService.getStatusOrder(StatusOrderId);
    }

    @PostMapping("/save")
    public StatusOrder save(@RequestBody StatusOrder StatusOrder) {
        return StatusOrderService.save(StatusOrder);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int StatusOrderId) {
        return StatusOrderService.delete(StatusOrderId);
    }
}