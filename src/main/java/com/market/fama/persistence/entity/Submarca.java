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
    private String rutaImagen;

    @Column(name = "id_marca")
    private int idMarca;

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

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
