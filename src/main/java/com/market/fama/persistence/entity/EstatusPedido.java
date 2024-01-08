package com.market.fama.persistence.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_estatus_pedido")
public class EstatusPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estatus_pedido")
    private Integer idEstatusPedido;

    @Column(name = "id_estatus")
    private Integer idEstatus;

    @Column(name = "id_pedido")
    private Integer idPedido;

    @Column(name = "activo_estatus_pedido")
    private String activoEstatusPedido;

    @Column(name = "fecha_cambio_estatus_pedido")
    private Date fechaCambioEstatusPedido;

    @OneToOne
    @JoinColumn(name = "id_estatus", insertable = false, updatable = false)
    private Estatus estatus;

    @OneToOne
    @JoinColumn(name = "id_pedido", insertable = false, updatable = false)
    private Pedido pedido;

    public Integer getIdEstatusPedido() {
        return idEstatusPedido;
    }

    public void setIdEstatusPedido(Integer idEstatusPedido) {
        this.idEstatusPedido = idEstatusPedido;
    }

    public Integer getIdEstatus() {
        return idEstatus;
    }

    public void setIdEstatus(Integer idEstatus) {
        this.idEstatus = idEstatus;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public String getActivoEstatusPedido() {
        return activoEstatusPedido;
    }

    public void setActivoEstatusPedido(String activoEstatusPedido) {
        this.activoEstatusPedido = activoEstatusPedido;
    }

    public Date getFechaCambioEstatusPedido() {
        return fechaCambioEstatusPedido;
    }

    public void setFechaCambioEstatusPedido(Date fechaCambioEstatusPedido) {
        this.fechaCambioEstatusPedido = fechaCambioEstatusPedido;
    }

    public Estatus getEstatus() {
        return estatus;
    }

    public void setEstatus(Estatus estatus) {
        this.estatus = estatus;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
