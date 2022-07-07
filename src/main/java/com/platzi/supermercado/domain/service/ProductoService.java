package com.platzi.supermercado.domain.service;

import com.platzi.supermercado.persistence.ProductoRepository;
import com.platzi.supermercado.persistence.crud.ProductoCrudRepository;
import com.platzi.supermercado.persistence.entity.Producto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    private ProductoRepository crudRepository;

    public List<Producto> getAll(){
        return crudRepository.getAll();
    }

    public Optional<Producto> getProducto(int idProducto){
        return crudRepository.getProducto(idProducto);
    }

}
