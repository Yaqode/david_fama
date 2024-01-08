package com.market.fama.persistence.entity;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "tbl_producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;

    @Column(name = "nombre_producto")
    private String nombreProducto;

    @Column(name = "descripcion_producto")
    private String descripcionProducto;

    @Column(name = "precio_producto")
    private Double precioProducto;

    @Column(name = "precio_descuento_producto")
    private Double precioDescuentoProducto;

    @Column(name = "codigo_barras_producto")
    private String codigoBarrasProducto;

    @Column(name = "codigo_interno_producto")
    private String codigoInternoProducto;

    @Column(name = "cantidad_producto")
    private Integer cantidadProducto;

    @Column(name = "id_subcategoria")
    private Integer idSubcategoria;

    @ManyToOne
    @JoinColumn(name = "id_subcategoria", insertable = false, updatable = false)
    private Subcategoria subcategoria;

    @Column(name = "id_submarca")
    private Integer idSubmarca;

    @ManyToOne
    @JoinColumn(name = "id_submarca", insertable = false, updatable = false)
    private Submarca submarca;

    @OneToMany(mappedBy = "productos")
    private List<Imagen> imagenes;

    @Column(name = "unidad_medida")
    private String unidadMedida;

    @OneToOne(mappedBy = "producto")
    private PedidoProducto pedidoProducto;

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public Double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public Double getPrecioDescuentoProducto() {
        return precioDescuentoProducto;
    }

    public void setPrecioDescuentoProducto(Double precioDescuentoProducto) {
        this.precioDescuentoProducto = precioDescuentoProducto;
    }

    public String getCodigoBarrasProducto() {
        return codigoBarrasProducto;
    }

    public void setCodigoBarrasProducto(String codigoBarrasProducto) {
        this.codigoBarrasProducto = codigoBarrasProducto;
    }

    public String getCodigoInternoProducto() {
        return codigoInternoProducto;
    }

    public void setCodigoInternoProducto(String codigoInternoProducto) {
        this.codigoInternoProducto = codigoInternoProducto;
    }

    public Integer getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(Integer cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public Integer getIdSubcategoria() {
        return idSubcategoria;
    }

    public void setIdSubcategoria(Integer idSubcategoria) {
        this.idSubcategoria = idSubcategoria;
    }

    public Integer getIdSubmarca() {
        return idSubmarca;
    }

    public void setIdSubmarca(Integer idSubmarca) {
        this.idSubmarca = idSubmarca;
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

    public List<Imagen> getImagenes() {
        return imagenes;
    }

    public void setImagenes(List<Imagen> imagenes) {
        this.imagenes = imagenes;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public PedidoProducto getPedidoProducto() {
        return pedidoProducto;
    }

    public void setPedidoProducto(PedidoProducto pedidoProducto) {
        this.pedidoProducto = pedidoProducto;
    }
}
