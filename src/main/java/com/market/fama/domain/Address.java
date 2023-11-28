package com.market.fama.domain;

public class Address {

    private int direccionId;
    private String calledireccion;
    private int nointdireccion;
    private int noextdireccion;
    private int cpdireccion;
    private String referenciadireccion;
    private Colony colony;





    public int getDireccionId() {
        return direccionId;
    }

    public void setDireccionId(int direccionId) {
        this.direccionId = direccionId;
    }

    public String getCalledireccion() {
        return calledireccion;
    }

    public void setCalledireccion(String calledireccion) {
        this.calledireccion = calledireccion;
    }

    public int getNointdireccion() {
        return nointdireccion;
    }

    public void setNointdireccion(int nointdireccion) {
        this.nointdireccion = nointdireccion;
    }

    public int getNoextdireccion() {
        return noextdireccion;
    }

    public void setNoextdireccion(int noextdireccion) {
        this.noextdireccion = noextdireccion;
    }

    public int getCpdireccion() {
        return cpdireccion;
    }

    public void setCpdireccion(int cpdireccion) {
        this.cpdireccion = cpdireccion;
    }

    public String getReferenciadireccion() {
        return referenciadireccion;
    }

    public void setReferenciadireccion(String referenciadireccion) {
        this.referenciadireccion = referenciadireccion;
    }

    public Colony getColony() {
        return colony;
    }

    public void setColony(Colony colony) {
        this.colony = colony;
    }
}
