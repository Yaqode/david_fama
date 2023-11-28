package com.market.fama.domain;

public class Image {

    private int imagenId;
    private String rutaimagen;
    private String noorden;
    private Product product;



    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getImagenId() {
        return imagenId;
    }

    public void setImagenId(int imagenId) {
        this.imagenId = imagenId;
    }

    public String getRutaimagen() {
        return rutaimagen;
    }

    public void setRutaimagen(String rutaimagen) {
        this.rutaimagen = rutaimagen;
    }

    public String getNoorden() {
        return noorden;
    }

    public void setNoorden(String noorden) {
        this.noorden = noorden;
    }
}
