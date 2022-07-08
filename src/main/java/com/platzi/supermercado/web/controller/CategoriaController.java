package com.platzi.supermercado.web.controller;

import com.platzi.supermercado.domain.service.CategoriaService;
import com.platzi.supermercado.persistence.entity.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/getAll")
    public List<Categoria> getAll(){
        return categoriaService.getAll();
    }

}
