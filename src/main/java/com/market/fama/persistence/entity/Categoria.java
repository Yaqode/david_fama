package com.market.fama.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cat_categoria")
public class Categoria {
    @Id
    @GeneratedValue
    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "nombre_categoria")
    private String nombreCategoria;

    @ManyToOne
    @JoinColumn(name = "id_familia", insertable = false, updatable = false)
    private Familia familia;

    @OneToMany(mappedBy = "subcategoria")
    private List<Subcategoria> subcategorias;

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
}
