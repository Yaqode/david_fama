package com.market.fama.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cat_marca")
public class Marca {
    @Id
    @GeneratedValue
    @Column(name = "id_marca")
    private Integer idMarca;

    @Column(name = "nombre_marca")
    private String nombreMarca;

    @Column(name = "ruta_imagen")
    private String rutaImagen;

    @OneToMany(mappedBy = "marca")
    private List<Submarca> submarcas;

    public Integer getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public List<Submarca> getSubmarcas() {
        return submarcas;
    }

    public void setSubmarcas(List<Submarca> submarcas) {
        this.submarcas = submarcas;
    }
}
