package com.market.fama.domain;

public class Subbrand {

    private int submarcaId;
    private String nombremarca;
    private String rutaimagen;
    private Brand brand;





    public int getSubmarcaId() {
        return submarcaId;
    }

    public void setSubmarcaId(int submarcaId) {
        this.submarcaId = submarcaId;
    }

    public String getNombremarca() {
        return nombremarca;
    }

    public void setNombremarca(String nombremarca) {
        this.nombremarca = nombremarca;
    }

    public String getRutaimagen() {
        return rutaimagen;
    }

    public void setRutaimagen(String rutaimagen) {
        this.rutaimagen = rutaimagen;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
