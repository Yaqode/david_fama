package com.market.fama.domain;

public class Brand {
    private int brandId;
    private String nameBrand;
    private String linkImageBrand;

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getNameBrand() {
        return nameBrand;
    }

    public void setNameBrand(String nameBrand) {
        this.nameBrand = nameBrand;
    }

    public String getLinkImageBrand() {
        return linkImageBrand;
    }

    public void setLinkImageBrand(String linkImageBrand) {
        this.linkImageBrand = linkImageBrand;
    }
}