package com.market.fama.domain;


public class Subbrand {
    private int subBrandId;
    private String nameSubBrand;
    private String linkImageSubbrand;
    private int brandId;
    private Brand brand;

    public int getSubBrandId() {
        return subBrandId;
    }

    public void setSubBrandId(int subBrandId) {
        this.subBrandId = subBrandId;
    }

    public String getNameSubBrand() {
        return nameSubBrand;
    }

    public void setNameSubBrand(String nameSubBrand) {
        this.nameSubBrand = nameSubBrand;
    }

    public String getLinkImageSubbrand() {
        return linkImageSubbrand;
    }

    public void setLinkImageSubbrand(String linkImageSubbrand) {
        this.linkImageSubbrand = linkImageSubbrand;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}