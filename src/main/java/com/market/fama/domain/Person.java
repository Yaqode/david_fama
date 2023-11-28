package com.market.fama.domain;

public class Person {
    private int personaId;
    private String nombrepersona;
    private String apellidopaterno;
    private String apellidomaterno;
    private double telefono_persona;




    public int getPersonaId() {
        return personaId;
    }

    public void setPersonaId(int personaId) {
        this.personaId = personaId;
    }

    public String getNombrepersona() {
        return nombrepersona;
    }

    public void setNombrepersona(String nombrepersona) {
        this.nombrepersona = nombrepersona;
    }

    public String getApellidopaterno() {
        return apellidopaterno;
    }

    public void setApellidopaterno(String apellidopaterno) {
        this.apellidopaterno = apellidopaterno;
    }

    public String getApellidomaterno() {
        return apellidomaterno;
    }

    public void setApellidomaterno(String apellidomaterno) {
        this.apellidomaterno = apellidomaterno;
    }

    public double getTelefono_persona() {
        return telefono_persona;
    }

    public void setTelefono_persona(double telefono_persona) {
        this.telefono_persona = telefono_persona;
    }
}