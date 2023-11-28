package com.market.fama.domain;

public class Subcategory {
    private int subcategoriaId;
    private String nombresubcategoria;
    private Category category;





    public int getSubcategoriaId() {
        return subcategoriaId;
    }

    public void setSubcategoriaId(int subcategoriaId) {
        this.subcategoriaId = subcategoriaId;
    }

    public String getNombresubcategoria() {
        return nombresubcategoria;
    }

    public void setNombresubcategoria(String nombresubcategoria) {
        this.nombresubcategoria = nombresubcategoria;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}