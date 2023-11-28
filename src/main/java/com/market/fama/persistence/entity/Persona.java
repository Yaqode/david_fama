package com.market.fama.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tbl_persona")
public class Persona {
    @Id //esto se pone dado que es llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona") //esta nos ayuda a definir el verdadero nombre
    private Integer idpersona;

    @Column(name = "nombre_persona")
    private String nombrepersona;

    @Column(name = "apellido_paterno")
    private String apellidopaterno;

    @Column(name = "apellido_materno")
    private String apellidomaterno;

    @Column(name = "telefono_persona")
    private Double telefono_persona;



    @OneToMany(mappedBy = "persona")
    private List<Usuario>usuarios;

    @OneToMany(mappedBy = "persona")
    private List<DireccionUsuario>direccionUsuarios;


    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<DireccionUsuario> getDireccionUsuarios() {
        return direccionUsuarios;
    }

    public void setDireccionUsuarios(List<DireccionUsuario> direccionUsuarios) {
        this.direccionUsuarios = direccionUsuarios;
    }

    public Integer getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Integer idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombrepersona() {
        return nombrepersona;
    }

    public void setNombrepersona(String nombrepersona) {
        this.nombrepersona = nombrepersona;
    }

    public String getApellidopaterno() {
        return apellidopaterno;
    }

    public void setApellidopaterno(String apellidopaterno) {
        this.apellidopaterno = apellidopaterno;
    }

    public String getApellidomaterno() {
        return apellidomaterno;
    }

    public void setApellidomaterno(String apellidomaterno) {
        this.apellidomaterno = apellidomaterno;
    }

    public Double getTelefono_persona() {
        return telefono_persona;
    }

    public void setTelefono_persona(Double telefono_persona) {
        this.telefono_persona = telefono_persona;
    }
}
