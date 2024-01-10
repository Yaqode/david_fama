package com.market.fama.domain.service;

import com.market.fama.domain.Order;
import com.market.fama.domain.OrderProduct;
import com.market.fama.domain.UtilService;
import com.market.fama.domain.repository.OrderProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class OrderProductService {
    @Autowired
    private OrderProductRepository OrderProductRepository;

    private UtilService utilService;


    public List<OrderProduct> getAll() {
        return OrderProductRepository.getAll();
    }

    public List<OrderProduct> getCarritoProductos(int idUser) {
        //Order order = orderService.getOrderActiveByIdUser(idUser);
        List<OrderProduct> productosCarrito = OrderProductRepository.findPedidoProductosActivosByUsuarioId(idUser);
        productosCarrito.forEach(orderProduct -> {
            orderProduct.getProduct().getImagens().forEach(image -> {
                try {
                    image.setImageRoute(utilService.leerImagenComoBase64("\\img\\productos\\" + image.getImageRoute()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

        });
        return productosCarrito;
    }

    public Optional<OrderProduct> getOrderProduct(int OrderProductId) {
        return OrderProductRepository.getOrderProduct(OrderProductId);
    }

    public OrderProduct save(OrderProduct OrderProduct) {
        return OrderProductRepository.save(OrderProduct);
    }

    public boolean delete(int OrderProductId) {
        return getOrderProduct(OrderProductId).map(OrderProduct -> {
            OrderProductRepository.delete(OrderProductId);
            return true;
        }).orElse(false);
    }
}
