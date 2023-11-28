package com.market.fama.persistence.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cat_subcategorias")

public class Subcategoria {

    @Id //esto se pone dado que es llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_subcategoria") //esta nos ayuda a definir el verdadero nombre
    private Integer idsubcategoria;

    @Column(name = "nombre_subcategoria")
    private String nombresubcategoria;

    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private Categoria categoria;

    @OneToMany(mappedBy = "subcategoria")
    private List<Producto> productos;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Integer getIdsubcategoria() {
        return idsubcategoria;
    }

    public void setIdsubcategoria(Integer idsubcategoria) {
        this.idsubcategoria = idsubcategoria;
    }

    public String getNombresubcategoria() {
        return nombresubcategoria;
    }

    public void setNombresubcategoria(String nombresubcategoria) {
        this.nombresubcategoria = nombresubcategoria;
    }


}
