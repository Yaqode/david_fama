package com.market.fama.domain;

public class Image {

    private Integer imageId;

    private String imageRoute;

    private Integer productId;

    private Integer ordenNo;

    private Image imagens;

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getImageRoute() {
        return imageRoute;
    }

    public void setImageRoute(String imageRoute) {
        this.imageRoute = imageRoute;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getOrdenNo() {
        return ordenNo;
    }

    public void setOrdenNo(Integer ordenNo) {
        this.ordenNo = ordenNo;
    }

    public Image getImagens() {
        return imagens;
    }

    public void setImagens(Image imagens) {
        this.imagens = imagens;
    }
}