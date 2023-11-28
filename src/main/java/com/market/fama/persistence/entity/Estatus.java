package com.market.fama.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cat_estatus")
public class Estatus {
    @Id //esto se pone dado que es llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estatus") //esta nos ayuda a definir el verdadero nombre
    private Integer idestatus;

    @Column(name = "nombre_estatus")
    private String nombreestatus;

    @Column(name = "descripcion_estatus")
    private String descripcionestatus;

    @Column(name = "no_status")
    private Integer no_status;


    @OneToMany(mappedBy = "estatus")
    private List<EstatusPedido>estatusPedidos;


    public List<EstatusPedido> getEstatusPedidos() {
        return estatusPedidos;
    }

    public void setEstatusPedidos(List<EstatusPedido> estatusPedidos) {
        this.estatusPedidos = estatusPedidos;
    }

    public Integer getIdestatus() {
        return idestatus;
    }

    public void setIdestatus(Integer idestatus) {
        this.idestatus = idestatus;
    }

    public String getNombreestatus() {
        return nombreestatus;
    }

    public void setNombreestatus(String nombreestatus) {
        this.nombreestatus = nombreestatus;
    }

    public String getDescripcionestatus() {
        return descripcionestatus;
    }

    public void setDescripcionestatus(String descripcionestatus) {
        this.descripcionestatus = descripcionestatus;
    }

    public Integer getNo_status() {
        return no_status;
    }

    public void setNo_status(Integer no_status) {
        this.no_status = no_status;
    }
}
