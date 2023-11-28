package com.market.fama.persistence.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tbl_pedido")
public class Pedido {
    @Id //esto se pone dado que es llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido") //esta nos ayuda a definir el verdadero nombre
    private Integer id_pedido;

    @Column(name = "total_pedido")
    private Double totalpedido;

    @Column(name = "activo_pedido")
    private Byte activo_pedido;

    @Column(name = "fecha_creacion_pedido")
    private Date fechacreacionpedido;

    @Column(name = "instrucciones_entrega_pedido")
    private String instruccionesentregapedido;

    @Column(name = "fecha_entrega_pedido")
    private Date fechaentregapedido;


    @OneToMany(mappedBy = "pedido")
    private List<EstatusPedido>estatusPedidos;


    @OneToMany(mappedBy = "pedido")
    private  List<PedidoProducto>pedidoProductos;




    @ManyToOne
    @JoinColumn(name = "id_usuario", updatable = false, insertable = false)
    private Usuario usuario;


    @ManyToOne
    @JoinColumn(name = "id_direccion", insertable = false,updatable = false)
    private Direccion direccion;

    public List<EstatusPedido> getEstatusPedidos() {
        return estatusPedidos;
    }

    public void setEstatusPedidos(List<EstatusPedido> estatusPedidos) {
        this.estatusPedidos = estatusPedidos;
    }

    public List<PedidoProducto> getPedidoProductos() {
        return pedidoProductos;
    }

    public void setPedidoProductos(List<PedidoProducto> pedidoProductos) {
        this.pedidoProductos = pedidoProductos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Integer getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(Integer id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Double getTotalpedido() {
        return totalpedido;
    }

    public void setTotalpedido(Double totalpedido) {
        this.totalpedido = totalpedido;
    }

    public Byte getActivo_pedido() {
        return activo_pedido;
    }

    public void setActivo_pedido(Byte activo_pedido) {
        this.activo_pedido = activo_pedido;
    }

    public Date getFechacreacionpedido() {
        return fechacreacionpedido;
    }

    public void setFechacreacionpedido(Date fechacreacionpedido) {
        this.fechacreacionpedido = fechacreacionpedido;
    }

    public String getInstruccionesentregapedido() {
        return instruccionesentregapedido;
    }

    public void setInstruccionesentregapedido(String instruccionesentregapedido) {
        this.instruccionesentregapedido = instruccionesentregapedido;
    }

    public Date getFechaentregapedido() {
        return fechaentregapedido;
    }

    public void setFechaentregapedido(Date fechaentregapedido) {
        this.fechaentregapedido = fechaentregapedido;
    }
}
