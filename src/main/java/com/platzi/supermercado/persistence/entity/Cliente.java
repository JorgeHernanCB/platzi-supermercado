package com.platzi.supermercado.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @Column(name = "\"id_cliente\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "\"nombre\"")
    private String nombre;

    @Column(name = "\"apellidos\"")
    private String apellidos;

    @Column(name = "\"celular\"")
    private long celular;

    @Column(name = "\"direccion\"")
    private String direccion;

    @Column(name = "\"correo_electronico\"")
    private String correo_electronico;

    // Relacion entre tablas

    @OneToMany(mappedBy = "clientes")
    private List<Compra> compras;

    // Getter and Setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }
}
