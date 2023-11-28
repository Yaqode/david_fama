package com.market.fama.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_imagen")
public class Imagen {
    @Id //esto se pone dado que es llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_imagen") //esta nos ayuda a definir el verdadero nombre
    private Integer idimagen;

    @Column(name = "ruta_imagen")
    private String rutaimagen;

    @Column(name = "no_orden")
    private Integer noorden;



    @ManyToOne
    @JoinColumn(name = "id_producto", updatable = false, insertable = false)
    private Producto producto;

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getIdimagen() {
        return idimagen;
    }

    public void setIdimagen(Integer idimagen) {
        this.idimagen = idimagen;
    }

    public String getRutaimagen() {
        return rutaimagen;
    }

    public void setRutaimagen(String rutaimagen) {
        this.rutaimagen = rutaimagen;
    }

    public Integer getNoorden() {
        return noorden;
    }

    public void setNoorden(Integer noorden) {
        this.noorden = noorden;
    }
}
