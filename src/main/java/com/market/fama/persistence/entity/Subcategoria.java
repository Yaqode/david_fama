package com.market.fama.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cat_subcategoria")
public class Subcategoria {
    @Id
    @GeneratedValue
    @Column(name = "id_subcategoria")
    private Integer idSubcategoria;

    @Column(name = "nombre_subcategoria")
    private String nombreSubcategoria;

    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private Categoria subcategoria;

    @OneToMany(mappedBy = "subcategoria")
    private List<Producto> productos;

    public Integer getIdSubcategoria() {
        return idSubcategoria;
    }

    public void setIdSubcategoria(Integer idSubcategoria) {
        this.idSubcategoria = idSubcategoria;
    }

    public String getNombreSubcategoria() {
        return nombreSubcategoria;
    }

    public void setNombreSubcategoria(String nombreSubcategoria) {
        this.nombreSubcategoria = nombreSubcategoria;
    }
}
