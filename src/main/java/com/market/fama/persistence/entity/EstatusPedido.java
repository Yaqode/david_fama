package com.market.fama.persistence.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tbl_estatus_pedido")
public class EstatusPedido {
    @Id //esto se pone dado que es llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estatus_pedido") //esta nos ayuda a definir el verdadero nombre
    private Integer idestatuspedido;

    @Column(name = "activo_estatus_pedido")
    private String activoestatuspedido;

    @Column(name = "fecha_cambio_estatus_pedido")
    private Date fecha_cambio_estatus_pedido;


    @ManyToOne
    @JoinColumn(name = "id_estatus", updatable = false,insertable = false)
    private Estatus estatus;


    @ManyToOne
    @JoinColumn(name = "id_pedido", insertable = false, updatable = false)
    private Pedido pedido;

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

    public Integer getIdestatuspedido() {
        return idestatuspedido;
    }

    public void setIdestatuspedido(Integer idestatuspedido) {
        this.idestatuspedido = idestatuspedido;
    }

    public String getActivoestatuspedido() {
        return activoestatuspedido;
    }

    public void setActivoestatuspedido(String activoestatuspedido) {
        this.activoestatuspedido = activoestatuspedido;
    }

    public Date getFecha_cambio_estatus_pedido() {
        return fecha_cambio_estatus_pedido;
    }

    public void setFecha_cambio_estatus_pedido(Date fecha_cambio_estatus_pedido) {
        this.fecha_cambio_estatus_pedido = fecha_cambio_estatus_pedido;
    }
}
