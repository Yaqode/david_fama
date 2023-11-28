package com.market.fama.domain;

public class User {
    private int usuarioId;
    private String correousuario;
    private String nombreusuario;
    private String contraseniausuario;
    private Role role;
    private Person person;




    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getCorreousuario() {
        return correousuario;
    }

    public void setCorreousuario(String correousuario) {
        this.correousuario = correousuario;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getContraseniausuario() {
        return contraseniausuario;
    }

    public void setContraseniausuario(String contraseniausuario) {
        this.contraseniausuario = contraseniausuario;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
