package com.market.fama.domain.service;

import com.market.fama.domain.Order;
import com.market.fama.domain.OrderProduct;
import com.market.fama.domain.Product;
import com.market.fama.domain.User;
import com.market.fama.domain.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository OrderRepository;

    @Autowired
    private OrderProductService orderProductService;

    public List<Order> getAll() {
        return OrderRepository.getAll();
    }

    public Optional<Order> getOrder(int OrderId) {
        return OrderRepository.getOrder(OrderId);
    }

    public Order getOrderActiveByIdUser(int UserId){
        return OrderRepository.getOrderActiveByIdUser(UserId);
    }

    public Order save(Order Order) {
        return OrderRepository.save(Order);
    }

    public Order agregarProducto(Order Order) {
        //Se debe consultar el carrito activo
        Order orderActive = getOrderActiveByIdUser(Order.getUserId());

        if (orderActive.isActiveOrder()) {
            // Se debe agregar solo un producto
            OrderProduct orderProduct = new OrderProduct();

            orderProduct.setProductId(Order.getOrderProduct().getProductId());
            orderProduct.setOrderId(orderActive.getOrderId());

            OrderProduct productoAgregado = orderProductService.save(orderProduct);

            return orderActive;

        } else {
            // El Optional está vacío, no hay Order activo para el usuario
            // Se debe crear un carrito
            Order orderNew = new Order();

            orderNew.setActiveOrder(true);
            orderNew.setUserId(Order.getUserId());

            orderNew =  OrderRepository.save(Order);

            OrderProduct orderProduct = new OrderProduct();

            orderProduct.setProductId(Order.getOrderProduct().getProductId());
            orderProduct.setOrderId(orderNew.getOrderId());

            OrderProduct productoAgregado = orderProductService.save(orderProduct);

            return orderNew;
        }
    }

    public boolean delete(int OrderId) {
        return getOrder(OrderId).map(Order -> {
            OrderRepository.delete(OrderId);
            return true;
        }).orElse(false);
    }
}
