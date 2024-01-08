package com.market.fama.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cat_estatus")
public class Estatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estatus")
    private Integer idEstatus;

    @Column(name = "nombre_estatus")
    private String nombreEstatus;

    @Column(name = "descripcion_estatus")
    private String descripcionEstatus;

    @Column(name = "no_status")
    private Integer noStatus;

    @OneToOne(mappedBy = "estatus")
    private EstatusPedido estatusPedido;

    public Integer getIdEstatus() {
        return idEstatus;
    }

    public void setIdEstatus(Integer idEstatus) {
        this.idEstatus = idEstatus;
    }

    public String getNombreEstatus() {
        return nombreEstatus;
    }

    public void setNombreEstatus(String nombreEstatus) {
        this.nombreEstatus = nombreEstatus;
    }

    public String getDescripcionEstatus() {
        return descripcionEstatus;
    }

    public void setDescripcionEstatus(String descripcionEstatus) {
        this.descripcionEstatus = descripcionEstatus;
    }

    public Integer getNoStatus() {
        return noStatus;
    }

    public void setNoStatus(Integer noStatus) {
        this.noStatus = noStatus;
    }

    public EstatusPedido getEstatusPedido() {
        return estatusPedido;
    }

    public void setEstatusPedido(EstatusPedido estatusPedido) {
        this.estatusPedido = estatusPedido;
    }
}
