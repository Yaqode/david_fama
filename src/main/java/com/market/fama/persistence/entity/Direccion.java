package com.market.fama.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tbl_direccion")
public class Direccion {
    @Id //esto se pone dado que es llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_direccion") //esta nos ayuda a definir el verdadero nombre
    private Integer iddireccion;

    @Column(name = "calle_direccion")
    private String calledireccion;

    @Column(name = "no_int_direccion")
    private Integer nointdireccion;

    @Column(name = "no_ext_direccion")
    private Integer noextdireccion;

    @Column(name = "cp_direccion")
    private Integer cpdireccion;

    @Column(name = "referencia_direccion")
    private String referencia_direccion;

    @OneToMany(mappedBy = "direccion")
    private  List<Pedido>pedidos;


    @OneToMany(mappedBy = "direccion")
    private List<DireccionUsuario>direccionUsuarios;


    @ManyToOne
    @JoinColumn(name = "id_colonia", updatable = false,insertable = false)
    private Colonia colonia;


    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public List<DireccionUsuario> getDireccionUsuarios() {
        return direccionUsuarios;
    }

    public void setDireccionUsuarios(List<DireccionUsuario> direccionUsuarios) {
        this.direccionUsuarios = direccionUsuarios;
    }

    public Colonia getColonia() {
        return colonia;
    }

    public void setColonia(Colonia colonia) {
        this.colonia = colonia;
    }

    public Integer getIddireccion() {
        return iddireccion;
    }

    public void setIddireccion(Integer iddireccion) {
        this.iddireccion = iddireccion;
    }

    public String getCalledireccion() {
        return calledireccion;
    }

    public void setCalledireccion(String calledireccion) {
        this.calledireccion = calledireccion;
    }

    public Integer getNointdireccion() {
        return nointdireccion;
    }

    public void setNointdireccion(Integer nointdireccion) {
        this.nointdireccion = nointdireccion;
    }

    public Integer getNoextdireccion() {
        return noextdireccion;
    }

    public void setNoextdireccion(Integer noextdireccion) {
        this.noextdireccion = noextdireccion;
    }

    public Integer getCpdireccion() {
        return cpdireccion;
    }

    public void setCpdireccion(Integer cpdireccion) {
        this.cpdireccion = cpdireccion;
    }

    public String getReferencia_direccion() {
        return referencia_direccion;
    }

    public void setReferencia_direccion(String referencia_direccion) {
        this.referencia_direccion = referencia_direccion;
    }
}
