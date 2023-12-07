package com.market.fama.persistence.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cat_submarca")
public class Submarca {
    @Id
    @GeneratedValue
    @Column(name = "id_submarca")
    private Integer idSubmarca;

    @Column(name = "nombre_submarca")
    private String nombreSubmarca;

    @Column(name = "ruta_imagen")
    private String ruta_imagen;

    @ManyToOne
    @JoinColumn(name = "id_marca", insertable = false, updatable = false)
    private Marca marca;

    @OneToMany(mappedBy = "submarca")
    private List<Producto> productos;

    public Integer getIdSubmarca() {
        return idSubmarca;
    }

    public void setIdSubmarca(Integer idSubmarca) {
        this.idSubmarca = idSubmarca;
    }

    public String getNombreSubmarca() {
        return nombreSubmarca;
    }

    public void setNombreSubmarca(String nombreSubmarca) {
        this.nombreSubmarca = nombreSubmarca;
    }

    public String getRuta_imagen() {
        return ruta_imagen;
    }

    public void setRuta_imagen(String ruta_imagen) {
        this.ruta_imagen = ruta_imagen;
    }

}
