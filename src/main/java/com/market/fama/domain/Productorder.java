package com.market.fama.domain;

public class Productorder {
    private int pedidoproductoId;
    private Product product;
    private Order order;




    public int getPedidoproductoId() {
        return pedidoproductoId;
    }

    public void setPedidoproductoId(int pedidoproductoId) {
        this.pedidoproductoId = pedidoproductoId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}

