package com.platzi.supermercado.persistence;

import com.platzi.supermercado.persistence.crud.ProductoCrudRepository;
import com.platzi.supermercado.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository {

    private ProductoCrudRepository crudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) crudRepository.findAll();
    }

    public List<Producto> getByCategoria(int idCategoria){
        return crudRepository.findByIdCategoria(idCategoria);
    }

    public Optional<Producto> getProducto(int idProducto){
        return crudRepository.findById(idProducto);
    }

    public Producto save(Producto producto){
        return crudRepository.save(producto);
    }

    public void delete(int idProducto){
        crudRepository.deleteById(idProducto);
    }

}
