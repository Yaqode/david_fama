package com.market.fama.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cat_marcas")
public class Marca {
    @Id //esto se pone dado que es llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_marca") //esta nos ayuda a definir el verdadero nombre
    private Integer idmarca;

    @Column(name = "nombre_marca")
    private String nombremarca;

    @Column(name = "ruta_imagen")
    private String rutaimagen;


    @OneToMany(mappedBy = "marca")
    private List<Submarca> submarcas;


    public Integer getIdmarca() {
        return idmarca;
    }

    public void setIdmarca(Integer idmarca) {
        this.idmarca = idmarca;
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

    public List<Submarca> getSubmarcas() {
        return submarcas;
    }

    public void setSubmarcas(List<Submarca> submarcas) {
        this.submarcas = submarcas;
    }
}
