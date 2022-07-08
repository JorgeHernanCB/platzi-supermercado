package com.platzi.supermercado.persistence.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @NotBlank
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "\"id_producto\"")
    private Long idProducto;
    @Basic
    @Column(name = "\"nombre\"")
    private String nombre;

    @Column(name = "\"id_categoria\"")
    private Long idCategoria;
    @Basic
    @Column(name = "\"codigo_barras\"")
    private String codigoBarras;
    @Basic
    @Column(name = "\"precio_venta\"")
    private Long precioVenta;
    @Basic
    @Column(name = "\"cantidad_stock\"")
    private Long cantidadStock;
    @Basic
    @Column(name = "\"estado\"")
    private Integer estado;


    // Relaciones entre tablas

    @ManyToOne
    @JoinColumn(name = "\"id_categoria\"", insertable = false, updatable = false)
    private Categoria categoria;


    // Metodos Getters y Setters

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Long getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Long precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Long getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Long cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}
