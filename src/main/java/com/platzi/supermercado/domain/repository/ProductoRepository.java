package com.platzi.supermercado.domain.repository;

import com.platzi.supermercado.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoRepository {

    List<Producto> getAll();

    List<Producto> getByCategoria(long idCategoria);

    Optional<Producto> getProducto(int idProducto);

    Producto save(Producto producto);

    void delete(int idProducto);

}
