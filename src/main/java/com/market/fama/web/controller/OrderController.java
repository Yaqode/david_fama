package com.market.fama.web.controller;

import com.market.fama.domain.Order;
import com.market.fama.domain.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pedido")
public class OrderController {

    @Autowired
    private OrderService OrderService;

    @GetMapping("/all")
    public List<Order> getAll() {
        return OrderService.getAll();
    }

    @GetMapping("/{OrderId}")
    public Optional<Order> getOrder(@PathVariable("OrderId") int OrderId) {
        return OrderService.getOrder(OrderId);
    }

    @GetMapping("/carrito/{userId}")
    public List<Order> getCarrito(@PathVariable("userId") int userId) {
        return OrderService.getCarrito(userId);
    }

    @PostMapping("/save")
    public Order save(@RequestBody Order Order) {
        return OrderService.save(Order);
    }

    @PostMapping("/agregarProducto")
    public Order agregarProducto(@RequestBody Order Order) {
        return OrderService.agregarProducto(Order);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int OrderId) {
        return OrderService.delete(OrderId);
    }
}