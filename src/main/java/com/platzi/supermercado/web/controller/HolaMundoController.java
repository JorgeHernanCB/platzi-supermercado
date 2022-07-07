package com.platzi.supermercado.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class HolaMundoController {

    @GetMapping("/hola")
    public String saludar(){
        return "Hola neas! 😎";
    }

    @GetMapping("/hola2")
    public String saludar2(){
        return "Hola neas! 😎";
    }

}