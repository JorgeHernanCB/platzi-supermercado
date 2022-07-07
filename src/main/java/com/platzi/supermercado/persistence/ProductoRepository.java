package com.platzi.supermercado.persistence;

import com.platzi.supermercado.persistence.crud.ProductoCrudRepository;
import com.platzi.supermercado.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {

    private ProductoCrudRepository crudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) crudRepository.findAll();
    }
}
