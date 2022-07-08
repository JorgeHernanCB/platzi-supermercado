package com.platzi.supermercado.domain.service;

import com.platzi.supermercado.persistence.crud.CategoriaCrudRepository;
import com.platzi.supermercado.persistence.entity.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaCrudRepository crudRepository;

    public List<Categoria> getAll(){
        return (List<Categoria>) crudRepository.findAll();
    }

}
