package com.anm.estoque.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class EstoqueCOntroller {
    @GetMapping("/")
    public void testeApi() {
       System.out.println("A API está funcionando!");
    }
    
    
}
