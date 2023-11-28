package com.market.fama.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cat_submarcas")
public class Submarca {

    @Id //esto se pone dado que es llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_submarca") //esta nos ayuda a definir el verdadero nombre
    private Integer idsubmarca;

    @Column(name = "nombre_submarca")
    private String nombremarca;

    @Column(name = "ruta_imagen")
    private String rutaimagen;


    @ManyToOne //muchos a uno
    @JoinColumn(name = "id_marca", insertable = false, updatable = false) //atravez de esta relacion no se podra hacer nada en la tabla marca, solo recuperamos datos
    private Marca marca;

    @OneToMany(mappedBy = "submarca")
    private List<Producto> productos;


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

    public Integer getIdsubmarca() {
        return idsubmarca;
    }

    public void setIdsubmarca(Integer idsubmarca) {
        this.idsubmarca = idsubmarca;
    }

    public String getNombremarca() {
        return nombremarca;
    }

    public void setNombremarca(String nombremarca) {
        this.nombremarca = nombremarca;
    }

    public String getRutaimagen() {return rutaimagen;}

    public void setRutaimagen(String rutaimagen) {
        this.rutaimagen = rutaimagen;
    }
}
