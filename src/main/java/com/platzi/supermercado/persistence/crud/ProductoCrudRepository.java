package com.platzi.supermercado.persistence.crud;

import com.platzi.supermercado.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto,Long> {

    List<Producto> findByIdCategoria(long idCategoria);

    Optional<Producto> findProductoByIdProducto(long id );

    List<Producto> findProductoByIdCategoria(long id);


    @Query(value = "SELECT * FROM productos WHERE \"id_categoria\" = :idCategoria", nativeQuery = true)
    List<Producto> ProductosPorCategoria(@Param("idCategoria") long idCategoria);



}
