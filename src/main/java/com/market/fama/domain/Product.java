package com.market.fama.domain;

import java.util.List;

public class Product {
    private int productId;
    private String nameProduct;
    private String descriptionProduct;
    private Double priceProduct;
    private Double priceDiscountProduct;
    private String barcodeProduct;
    private String codeInternalProduct;
    private int amountProduct;
    private int subcategoryId;
    private Subcategory subcategory;
    private int subbrandId;
    private Subbrand subbrand;
    private String unitMeasurement;
    private List<Image> imagens;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    public Double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(Double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public Double getPriceDiscountProduct() {
        return priceDiscountProduct;
    }

    public void setPriceDiscountProduct(Double priceDiscountProduct) {
        this.priceDiscountProduct = priceDiscountProduct;
    }

    public String getBarcodeProduct() {
        return barcodeProduct;
    }

    public void setBarcodeProduct(String barcodeProduct) {
        this.barcodeProduct = barcodeProduct;
    }

    public String getCodeInternalProduct() {
        return codeInternalProduct;
    }

    public void setCodeInternalProduct(String codeInternalProduct) {
        this.codeInternalProduct = codeInternalProduct;
    }

    public int getAmountProduct() {
        return amountProduct;
    }

    public void setAmountProduct(int amountProduct) {
        this.amountProduct = amountProduct;
    }

    public int getSubcategoryId() {
        return subcategoryId;
    }

    public void setSubcategoryId(int subcategoryId) {
        this.subcategoryId = subcategoryId;
    }

    public Subcategory getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(Subcategory subcategory) {
        this.subcategory = subcategory;
    }

    public int getSubbrandId() {
        return subbrandId;
    }

    public void setSubbrandId(int subbrandId) {
        this.subbrandId = subbrandId;
    }

    public Subbrand getSubbrand() {
        return subbrand;
    }

    public void setSubbrand(Subbrand subbrand) {
        this.subbrand = subbrand;
    }

    public String getUnitMeasurement() {
        return unitMeasurement;
    }

    public void setUnitMeasurement(String unitMeasurement) {
        this.unitMeasurement = unitMeasurement;
    }

    public List<Image> getImagens() {
        return imagens;
    }

    public void setImagens(List<Image> imagens) {
        this.imagens = imagens;
    }
}