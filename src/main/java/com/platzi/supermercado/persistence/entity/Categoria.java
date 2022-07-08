package com.platzi.supermercado.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categorias", schema = "platzi")
public class Categoria {

    @Id
    @Column(name = "\"id_categoria\"")
    private long idCategoria;

    @Column(name = "\"descripcion\"")
    private String descripcion;

    @Column(name = "\"estado\"")
    private Integer estado;

    // Relaciones entre tablas

    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;

    // Getter and Setter

    public long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}
