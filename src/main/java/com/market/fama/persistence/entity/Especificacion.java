package com.market.fama.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cat_especificacion")
public class Especificacion {
    @Id //esto se pone dado que es llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_especificacion") //esta nos ayuda a definir el verdadero nombre
    private Integer idespecificacion;

    @Column(name = "nombre_especificacion")
    private String nombreespecificacion;

    @Column(name = "descripcion_especificacion")
    private String descripcionespecificacion;

    @OneToMany(mappedBy = "especificacion")
    private List<EspecificacionProducto> especificacionProductos;

    public List<EspecificacionProducto> getEspecificacionProductos() {
        return especificacionProductos;
    }

    public void setEspecificacionProductos(List<EspecificacionProducto> especificacionProductos) {
        this.especificacionProductos = especificacionProductos;
    }

    public Integer getIdespecificacion() {
        return idespecificacion;
    }

    public void setIdespecificacion(Integer idespecificacion) {
        this.idespecificacion = idespecificacion;
    }

    public String getNombreespecificacion() {
        return nombreespecificacion;
    }

    public void setNombreespecificacion(String nombreespecificacion) {
        this.nombreespecificacion = nombreespecificacion;
    }

    public String getDescripcionespecificacion() {
        return descripcionespecificacion;
    }

    public void setDescripcionespecificacion(String descripcionespecificacion) {
        this.descripcionespecificacion = descripcionespecificacion;
    }


}
