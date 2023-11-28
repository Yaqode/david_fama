package com.market.fama.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cat_colonia")
public class Colonia {
    @Id //esto se pone dado que es llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_colonia") //esta nos ayuda a definir el verdadero nombre
    private Integer idcolonia;

    @Column(name = "nombre_colonia")
    private String nombre_colonia;

    @OneToMany(mappedBy = "colonia")
    private List<Direccion>direccions;


    public List<Direccion> getDireccions() {
        return direccions;
    }

    public void setDireccions(List<Direccion> direccions) {
        this.direccions = direccions;
    }

    public Integer getIdcolonia() {
        return idcolonia;
    }

    public void setIdcolonia(Integer idcolonia) {
        this.idcolonia = idcolonia;
    }

    public String getNombre_colonia() {
        return nombre_colonia;
    }

    public void setNombre_colonia(String nombre_colonia) {
        this.nombre_colonia = nombre_colonia;
    }


}
