package com.market.fama.domain;

public class Productspecification {

    private int especificacionproductoId;
    private Specification specification;
    private Product product;




    public int getEspecificacionproductoId() {
        return especificacionproductoId;
    }

    public void setEspecificacionproductoId(int especificacionproductoId) {
        this.especificacionproductoId = especificacionproductoId;
    }

    public Specification getSpecification() {
        return specification;
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
