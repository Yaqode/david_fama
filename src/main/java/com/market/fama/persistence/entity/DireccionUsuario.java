package com.market.fama.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_direccion_usuario")
public class DireccionUsuario {
    @Id //esto se pone dado que es llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_direccion_usuario") //esta nos ayuda a definir el verdadero nombre
    private Integer iddireccionusuario;


    @ManyToOne
    @JoinColumn(name = "id_direccion", insertable = false, updatable = false)
    private Direccion direccion;

    @ManyToOne
    @JoinColumn(name = "id_persona", insertable = false, updatable = false)
    private Persona persona;

    public DireccionUsuario(Direccion direccion, Persona persona) {
        this.direccion = direccion;
        this.persona = persona;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Integer getIddireccionusuario() {
        return iddireccionusuario;
    }

    public void setIddireccionusuario(Integer iddireccionusuario) {
        this.iddireccionusuario = iddireccionusuario;
    }
}
