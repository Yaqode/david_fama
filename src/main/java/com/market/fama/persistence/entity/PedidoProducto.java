package com.market.fama.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_pedido_producto")
public class PedidoProducto {
    @Id //esto se pone dado que es llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido_producto") //esta nos ayuda a definir el verdadero nombre
    private Integer idpedidoproducto;


    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Producto producto;


    @ManyToOne
    @JoinColumn(name = "id_pedido", insertable = false, updatable = false)
    private Pedido pedido;


    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Integer getIdpedidoproducto() {
        return idpedidoproducto;
    }

    public void setIdpedidoproducto(Integer idpedidoproducto) {
        this.idpedidoproducto = idpedidoproducto;
    }
}
