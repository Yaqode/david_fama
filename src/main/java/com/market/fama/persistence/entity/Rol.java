package com.market.fama.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cat_rol")
public class Rol {

    @Id //esto se pone dado que es llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol") //esta nos ayuda a definir el verdadero nombre
    private Integer idrol;

    @Column(name = "nombre_rol")
    private String nomberol;

    @Column(name = "descripcion_rol")
    private String descripcionrol;


    @OneToMany(mappedBy = "rol")
    private List<Usuario>usuarios;

    public Rol(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }


    public Integer getIdrol() {
        return idrol;
    }

    public void setIdrol(Integer idrol) {
        this.idrol = idrol;
    }

    public String getNomberol() {
        return nomberol;
    }

    public void setNomberol(String nomberol) {
        this.nomberol = nomberol;
    }

    public String getDescripcionrol() {
        return descripcionrol;
    }

    public void setDescripcionrol(String descripcionrol) {
        this.descripcionrol = descripcionrol;
    }
}
