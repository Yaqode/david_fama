package com.market.fama.persistence.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tbl_compra")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Integer idCompra;

    @Column(name = "clave_transaccion_paypal")
    private String claveTransaccionPaypal;

    @Column(name = "fecha_compra")
    private Date fechaCompra;

    @Column(name = "id_pedido")
    private Integer idPedido;

    @OneToOne
    @JoinColumn(name = "id_pedido", insertable = false, updatable = false)
    private Pedido pedido;

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public String getClaveTransaccionPaypal() {
        return claveTransaccionPaypal;
    }

    public void setClaveTransaccionPaypal(String claveTransaccionPaypal) {
        this.claveTransaccionPaypal = claveTransaccionPaypal;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
