package com.market.fama.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_especificacion_producto")
public class EspecificacionProducto {
    @Id //esto se pone dado que es llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_especificacion_producto") //esta nos ayuda a definir el verdadero nombre
    private Integer idespecificacion_producto;


    @ManyToOne //muchos a uno
    @JoinColumn(name = "id_especificacion", insertable = false, updatable = false) //atravez de esta relacion no se podra hacer nada en la tabla marca, solo recuperamos datos
    private Especificacion especificacion;


    @ManyToOne
    @JoinColumn(name ="id_producto", insertable = false, updatable = false)
    private Producto producto;


    public Integer getIdespecificacion_producto() {
        return idespecificacion_producto;
    }

    public void setIdespecificacion_producto(Integer idespecificacion_producto) {
        this.idespecificacion_producto = idespecificacion_producto;
    }

    public Especificacion getEspecificacion() {
        return especificacion;
    }

    public void setEspecificacion(Especificacion especificacion) {
        this.especificacion = especificacion;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
