package com.market.fama.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
//esta clase se compportara que mapea una tabla de la base de datos (Esta es lo mas importante)
@Table(name = "cat_familias")
public class Familia {

    @Id //esto se pone dado que es llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_familia") //esta nos ayuda a definir el verdadero nombre
    private Integer idfamilia;

    @Column(name = "nombre_familia") //esta nos ayuda a definir el verdadero nombre
    private String nombrefamilia;

    @OneToMany(mappedBy = "familia")
    private List<Categoria> categorias;







    public Integer getIdfamilia() {
        return idfamilia;
    }

    public void setIdfamilia(Integer idfamilia) {
        this.idfamilia = idfamilia;
    }

    public String getNombrefamilia() {
        return nombrefamilia;
    }

    public void setNombrefamilia(String nombrefamilia) {
        this.nombrefamilia = nombrefamilia;
    }
}
