package com.market.fama.persistence.entity;

import jakarta.persistence.*;
import java.util.List;

import java.util.Date;

@Entity
@Table(name = "tbl_pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    private Integer idPedido;

    @Column(name = "total_pedido")
    private Double totalPedido;

    @Column(name = "activo_pedido")
    private boolean activoPedido;

    @Column(name = "fecha_creacion_pedido")
    private Date fechaCreacionPedido;

    @Column(name = "instrucciones_entrega_pedido")
    private String instruccionesEntregaPedido;

    @Column(name = "fecha_entrega_pedido")
    private Date fechaEntregaPedido;

    @Column(name = "id_direccion_entrega_pedido")
    private Integer idDireccionEntregaPedido;

    @Column(name = "id_usuario")
    private Integer idUsuario;

    @OneToOne(mappedBy = "pedido")
    private Compra compra;

    @OneToOne(mappedBy = "pedido")
    private PedidoProducto pedidoProducto;

    @OneToOne(mappedBy = "pedido")
    private EstatusPedido estatusPedido;

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Double getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(Double totalPedido) {
        this.totalPedido = totalPedido;
    }

    public boolean isActivoPedido() {
        return activoPedido;
    }

    public void setActivoPedido(boolean activoPedido) {
        this.activoPedido = activoPedido;
    }

    public Date getFechaCreacionPedido() {
        return fechaCreacionPedido;
    }

    public void setFechaCreacionPedido(Date fechaCreacionPedido) {
        this.fechaCreacionPedido = fechaCreacionPedido;
    }

    public String getInstruccionesEntregaPedido() {
        return instruccionesEntregaPedido;
    }

    public void setInstruccionesEntregaPedido(String instruccionesEntregaPedido) {
        this.instruccionesEntregaPedido = instruccionesEntregaPedido;
    }

    public Date getFechaEntregaPedido() {
        return fechaEntregaPedido;
    }

    public void setFechaEntregaPedido(Date fechaEntregaPedido) {
        this.fechaEntregaPedido = fechaEntregaPedido;
    }

    public Integer getIdDireccionEntregaPedido() {
        return idDireccionEntregaPedido;
    }

    public void setIdDireccionEntregaPedido(Integer idDireccionEntregaPedido) {
        this.idDireccionEntregaPedido = idDireccionEntregaPedido;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public PedidoProducto getPedidoProducto() {
        return pedidoProducto;
    }

    public void setPedidoProducto(PedidoProducto pedidoProducto) {
        this.pedidoProducto = pedidoProducto;
    }

    public EstatusPedido getEstatusPedido() {
        return estatusPedido;
    }

    public void setEstatusPedido(EstatusPedido estatusPedido) {
        this.estatusPedido = estatusPedido;
    }
}
