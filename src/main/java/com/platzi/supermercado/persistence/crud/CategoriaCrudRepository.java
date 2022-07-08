package com.platzi.supermercado.persistence.crud;

import com.platzi.supermercado.persistence.entity.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaCrudRepository extends CrudRepository<Categoria,Long> {


}
