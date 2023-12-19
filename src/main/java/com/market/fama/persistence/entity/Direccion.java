package com.market.fama.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tbl_direccion")
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_direccion")
    private Integer idDireccion;

    @Column(name = "calle_direccion")
    private String calleDireccion;

    @Column(name = "no_int_direccion")
    private Integer noIntDireccion;

    @Column(name = "no_ext_direccion")
    private Integer noExtDireccion;

    @Column(name = "cp_direccion")
    private Integer cpDireccion;

    @Column(name = "referencia_direccion")
    private String referenciaDireccion;

    @Column(name = "id_colonia")
    private Integer idcolonia;

    @Column(name = "id_usuario")
    private Integer idUsuario;

    @ManyToOne
    @JoinColumn(name = "id_colonia", insertable = false, updatable = false)
    private Colonia colonias;

    @ManyToOne
    @JoinColumn(name = "id_usuario", insertable = false, updatable = false)
    private List<Usuario> usuarios;

    public Integer getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getCalleDireccion() {
        return calleDireccion;
    }

    public void setCalleDireccion(String calleDireccion) {
        this.calleDireccion = calleDireccion;
    }

    public Integer getNoIntDireccion() {
        return noIntDireccion;
    }

    public void setNoIntDireccion(Integer noIntDireccion) {
        this.noIntDireccion = noIntDireccion;
    }

    public Integer getNoExtDireccion() {
        return noExtDireccion;
    }

    public void setNoExtDireccion(Integer noExtDireccion) {
        this.noExtDireccion = noExtDireccion;
    }

    public Integer getCpDireccion() {
        return cpDireccion;
    }

    public void setCpDireccion(Integer cpDireccion) {
        this.cpDireccion = cpDireccion;
    }

    public String getReferenciaDireccion() {
        return referenciaDireccion;
    }

    public void setReferenciaDireccion(String referenciaDireccion) {
        this.referenciaDireccion = referenciaDireccion;
    }

    public Integer getIdcolonia() {
        return idcolonia;
    }

    public void setIdcolonia(Integer idcolonia) {
        this.idcolonia = idcolonia;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Colonia getColonias() {
        return colonias;
    }

    public void setColonias(Colonia colonias) {
        this.colonias = colonias;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}