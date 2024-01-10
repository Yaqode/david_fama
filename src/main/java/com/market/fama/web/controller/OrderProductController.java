package com.market.fama.web.controller;

import com.market.fama.domain.OrderProduct;
import com.market.fama.domain.service.OrderProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pedido_producto")
public class OrderProductController {

    @Autowired
    private OrderProductService OrderProductService;

    @GetMapping("/all")
    public List<OrderProduct> getAll() {
        return OrderProductService.getAll();
    }

    @GetMapping("/carrito/{userId}")
    public List<OrderProduct> getCarrito(@PathVariable("userId") int userId) {
        return OrderProductService.getCarritoProductos(userId);
    }

    @GetMapping("/{OrderProductId}")
    public Optional<OrderProduct> getOrderProduct(@PathVariable("OrderProductId") int OrderProductId) {
        return OrderProductService.getOrderProduct(OrderProductId);
    }

    @PostMapping("/save")
    public OrderProduct save(@RequestBody OrderProduct OrderProduct) {
        return OrderProductService.save(OrderProduct);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int OrderProductId) {
        return OrderProductService.delete(OrderProductId);
    }
}