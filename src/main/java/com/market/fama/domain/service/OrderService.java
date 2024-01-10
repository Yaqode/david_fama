package com.market.fama.domain.service;

import com.market.fama.domain.Order;
import com.market.fama.domain.OrderProduct;
import com.market.fama.domain.Product;
import com.market.fama.domain.User;
import com.market.fama.domain.repository.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private static final Logger logger = LoggerFactory.getLogger(OrderService.class);

    public List<Order> getAll() {
        return OrderRepository.getAll();
    }

    public Optional<Order> getOrder(int OrderId) {
        return OrderRepository.getOrder(OrderId);
    }

    public List<Order> getCarrito(int user) {
        return OrderRepository.getOrderActiveByIdUser(user);
    }

    public Order getOrderActiveByIdUser(int UserId){
        return OrderRepository.getOrderActiveByIdUser(UserId).get(0);
    }

    public Order save(Order Order) {
        return OrderRepository.save(Order);
    }

    public Order agregarProducto(Order Order) {
        logger.info("Orden activa " + Order.toString());
        //Se debe consultar el carrito activo
        Order orderActive = getOrderActiveByIdUser(Order.getUserId());
        logger.info("Orden activa " + orderActive.toString());
        if (orderActive != null) {
            // Se debe agregar solo un producto
            OrderProduct orderProduct = new OrderProduct();

            orderProduct.setProductId(Order.getOrderProduct().getProductId());
            orderProduct.setOrderId(orderActive.getOrderId());
            logger.info("Productos " + orderProduct.toString());
            OrderProduct productoAgregado = orderProductService.save(orderProduct);
            logger.info("Orden agregada " + productoAgregado.toString());
            return orderActive;

        } else {
            // El Optional está vacío, no hay Order activo para el usuario
            // Se debe crear un carrito
            logger.info("Se crea carrito" );
            Order orderNew = new Order();

            orderNew.setActiveOrder(true);
            orderNew.setUserId(Order.getUserId());
            logger.info("Se crea busca guardar un pedido" +orderNew.toString());
            orderNew =  OrderRepository.save(orderNew);
            logger.info("Se guardo un pedido" +orderNew.toString());
            OrderProduct orderProduct = new OrderProduct();

            orderProduct.setProductId(Order.getOrderProduct().getProductId());
            orderProduct.setOrderId(orderNew.getOrderId());
            logger.info("Se crea busca guardar un producto pedido" +orderProduct.toString());
            OrderProduct productoAgregado = orderProductService.save(orderProduct);
            logger.info("Se guardo un pedido producto " +productoAgregado.toString());
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
