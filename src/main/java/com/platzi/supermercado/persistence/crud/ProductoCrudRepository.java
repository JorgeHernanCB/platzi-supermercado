package com.platzi.supermercado.persistence.crud;

import com.platzi.supermercado.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {


}
