package com.platzi.supermercado.domain.service;

import com.platzi.supermercado.persistence.crud.ProductoCrudRepository;
import com.platzi.supermercado.persistence.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {
    @Autowired
    private ProductoCrudRepository crudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) crudRepository.findAll();
    }

    public Optional<Producto> getProducto(Long idProducto) {
        return crudRepository.findProductoByIdProducto(idProducto);
    }

    public List<Producto> getByCategoria(long idCategoria){
        return crudRepository.findProductoByIdCategoria(idCategoria);
    }

    public List<Producto> ProductosPorCategoria(long idCategoria){
        return crudRepository.ProductosPorCategoria(idCategoria);
    }

}
