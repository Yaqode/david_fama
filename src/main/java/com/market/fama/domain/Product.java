package com.market.fama.domain;

public class Product {
    private int productoId;
    private String nombreproducto;
    private String descripcionproducto;
    private double precioproducto;
    private double preciodescuentoproducto;
    private String codigobarrasproducto;
    private String codigointernoproducto;
    private int cantidadproducto;
    private Subcategory subcategory;
    private Subbrand subbrand;






    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public String getDescripcionproducto() {
        return descripcionproducto;
    }

    public void setDescripcionproducto(String descripcionproducto) {
        this.descripcionproducto = descripcionproducto;
    }

    public double getPrecioproducto() {
        return precioproducto;
    }

    public void setPrecioproducto(double precioproducto) {
        this.precioproducto = precioproducto;
    }

    public double getPreciodescuentoproducto() {
        return preciodescuentoproducto;
    }

    public void setPreciodescuentoproducto(double preciodescuentoproducto) {
        this.preciodescuentoproducto = preciodescuentoproducto;
    }

    public String getCodigobarrasproducto() {
        return codigobarrasproducto;
    }

    public void setCodigobarrasproducto(String codigobarrasproducto) {
        this.codigobarrasproducto = codigobarrasproducto;
    }

    public String getCodigointernoproducto() {
        return codigointernoproducto;
    }

    public void setCodigointernoproducto(String codigointernoproducto) {
        this.codigointernoproducto = codigointernoproducto;
    }

    public int getCantidadproducto() {
        return cantidadproducto;
    }

    public void setCantidadproducto(int cantidadproducto) {
        this.cantidadproducto = cantidadproducto;
    }

    public Subcategory getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(Subcategory subcategory) {
        this.subcategory = subcategory;
    }

    public Subbrand getSubbrand() {
        return subbrand;
    }

    public void setSubbrand(Subbrand subbrand) {
        this.subbrand = subbrand;
    }
}