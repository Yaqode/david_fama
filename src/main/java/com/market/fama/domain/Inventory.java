package com.market.fama.domain;

import java.util.Date;

public class Inventory {
    private int inventarioId;
    private int cantidadanteriorinventario;
    private int cantidadnuevoinventario;
    private Date fechamovimiento;
    private Product product;
    private User user;




    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getInventarioId() {
        return inventarioId;
    }

    public void setInventarioId(int inventarioId) {
        this.inventarioId = inventarioId;
    }

    public int getCantidadanteriorinventario() {
        return cantidadanteriorinventario;
    }

    public void setCantidadanteriorinventario(int cantidadanteriorinventario) {
        this.cantidadanteriorinventario = cantidadanteriorinventario;
    }

    public int getCantidadnuevoinventario() {
        return cantidadnuevoinventario;
    }

    public void setCantidadnuevoinventario(int cantidadnuevoinventario) {
        this.cantidadnuevoinventario = cantidadnuevoinventario;
    }

    public Date getFechamovimiento() {
        return fechamovimiento;
    }

    public void setFechamovimiento(Date fechamovimiento) {
        this.fechamovimiento = fechamovimiento;
    }
}
