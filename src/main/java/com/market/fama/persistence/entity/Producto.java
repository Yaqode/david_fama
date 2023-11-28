package com.market.fama.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tbl_productos")
public class Producto {
    @Id //esto se pone dado que es llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto") //esta nos ayuda a definir el verdadero nombre
    private Integer idproducto;

    @Column(name = "nombre_producto")
    private String nombreproducto;

    @Column(name = "descripcion_producto")
    private String descripcionproducto;

    @Column(name = "precio_producto")
    private Double precioproducto;

    @Column(name = "precio_descuento_producto")
    private Double preciodescuentoproducto;

    @Column(name = "codigo_barras_producto")
    private String codigobarrasproducto;

    @Column(name = "codigo_interno_producto")
    private String codigointernoproducto;

    @Column(name = "cantidad_producto")
    private Integer cantidadproducto;




    @OneToMany(mappedBy = "producto")
    private List<EspecificacionProducto> especificacionProductos;

    @OneToMany(mappedBy = "producto")
    private  List<Imagen> imagens;

    @OneToMany(mappedBy = "producto")
    private  List<Inventario>inventarios;

    @OneToMany(mappedBy = "producto")
    private  List<PedidoProducto>pedidoProductos;


    public List<EspecificacionProducto> getEspecificacionProductos() {
        return especificacionProductos;
    }

    public void setEspecificacionProductos(List<EspecificacionProducto> especificacionProductos) {
        this.especificacionProductos = especificacionProductos;
    }

    public List<Imagen> getImagens() {
        return imagens;
    }

    public void setImagens(List<Imagen> imagens) {
        this.imagens = imagens;
    }

    public List<Inventario> getInventarios() {
        return inventarios;
    }

    public void setInventarios(List<Inventario> inventarios) {
        this.inventarios = inventarios;
    }

    public List<PedidoProducto> getPedidoProductos() {
        return pedidoProductos;
    }

    public void setPedidoProductos(List<PedidoProducto> pedidoProductos) {
        this.pedidoProductos = pedidoProductos;
    }

    public Subcategoria getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(Subcategoria subcategoria) {
        this.subcategoria = subcategoria;
    }

    public Submarca getSubmarca() {
        return submarca;
    }

    public void setSubmarca(Submarca submarca) {
        this.submarca = submarca;
    }

    @ManyToOne
    @JoinColumn(name = "id_subcategoria", insertable = false, updatable = false)
    private Subcategoria subcategoria;

    @ManyToOne
    @JoinColumn(name = "id_submarca", insertable = false, updatable = false)
    private Submarca submarca;






    public Integer getIdproducto() { return idproducto; }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public String getDescripcionproducto() {
        return descripcionproducto;
    }

    public void setDescripcionproducto(String descripcionproducto) {
        this.descripcionproducto = descripcionproducto;
    }

    public Double getPrecioproducto() {
        return precioproducto;
    }

    public void setPrecioproducto(Double precioproducto) {
        this.precioproducto = precioproducto;
    }

    public Double getPreciodescuentoproducto() {
        return preciodescuentoproducto;
    }

    public void setPreciodescuentoproducto(Double preciodescuentoproducto) {
        this.preciodescuentoproducto = preciodescuentoproducto;
    }

    public String getCodigobarrasproducto() {
        return codigobarrasproducto;
    }

    public void setCodigobarrasproducto(String codigobarrasproducto) {
        this.codigobarrasproducto = codigobarrasproducto;
    }

    public String getCodigointernoproducto() {
        return codigointernoproducto;
    }

    public void setCodigointernoproducto(String codigointernoproducto) {
        this.codigointernoproducto = codigointernoproducto;
    }

    public Integer getCantidadproducto() {
        return cantidadproducto;
    }

    public void setCantidadproducto(Integer cantidadproducto) {
        this.cantidadproducto = cantidadproducto;
    }
}
