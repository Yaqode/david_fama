package com.market.fama.domain;

import java.util.Date;

public class Orderstatus {
    private int estatuspedidoId;
    private String activoestatuspedido;
    private Date fechacambioestatuspedido;
    private Status status;
    private Order order;




    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getEstatuspedidoId() {
        return estatuspedidoId;
    }

    public void setEstatuspedidoId(int estatuspedidoId) {
        this.estatuspedidoId = estatuspedidoId;
    }

    public String getActivoestatuspedido() {
        return activoestatuspedido;
    }

    public void setActivoestatuspedido(String activoestatuspedido) {
        this.activoestatuspedido = activoestatuspedido;
    }

    public Date getFechacambioestatuspedido() {
        return fechacambioestatuspedido;
    }

    public void setFechacambioestatuspedido(Date fechacambioestatuspedido) {
        this.fechacambioestatuspedido = fechacambioestatuspedido;
    }




}

