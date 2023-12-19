package com.market.fama.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_direccion_usuario")
public class DireccionUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_direccion_usuario")
    private Integer idDireccionUsuario;

    @Column(name = "id_direccion")
    private Integer idDireccion;

    @Column(name = "id_persona")
    private Integer idPersona;
}