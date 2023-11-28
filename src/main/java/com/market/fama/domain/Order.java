package com.market.fama.domain;

import java.util.Date;

public class Order {

    private int pedidoId;
    private double totalpedido;
    private byte activo_pedido;
    private Date fechacreacionpedido;
    private String instruccionesentregapedido;
    private Date fechaentregapedido;
    private User user;
    private Address address;




    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }

    public double getTotalpedido() {
        return totalpedido;
    }

    public void setTotalpedido(double totalpedido) {
        this.totalpedido = totalpedido;
    }

    public byte getActivo_pedido() {
        return activo_pedido;
    }

    public void setActivo_pedido(byte activo_pedido) {
        this.activo_pedido = activo_pedido;
    }

    public Date getFechacreacionpedido() {
        return fechacreacionpedido;
    }

    public void setFechacreacionpedido(Date fechacreacionpedido) {
        this.fechacreacionpedido = fechacreacionpedido;
    }

    public String getInstruccionesentregapedido() {
        return instruccionesentregapedido;
    }

    public void setInstruccionesentregapedido(String instruccionesentregapedido) {
        this.instruccionesentregapedido = instruccionesentregapedido;
    }

    public Date getFechaentregapedido() {
        return fechaentregapedido;
    }

    public void setFechaentregapedido(Date fechaentregapedido) {
        this.fechaentregapedido = fechaentregapedido;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
