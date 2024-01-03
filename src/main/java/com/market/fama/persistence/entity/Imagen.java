package com.market.fama.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tbl_imagen")
public class Imagen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_imagen")
    private Integer idImagen;

    @Column(name = "ruta_imagen")
    private String rutaImagen;

    @Column(name = "id_producto")
    private Integer idProducto;

    @Column(name = "no_orden")
    private Integer noOrden;

    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Producto productos;

    public Integer getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(Integer idImagen) {
        this.idImagen = idImagen;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getNoOrden() {
        return noOrden;
    }

    public void setNoOrden(Integer noOrden) {
        this.noOrden = noOrden;
    }

    public Producto getProducto() {
        return productos;
    }

    public void setProducto(Producto producto) {
        this.productos = producto;
    }
}