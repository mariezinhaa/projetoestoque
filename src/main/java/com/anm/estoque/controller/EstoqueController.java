// Exemplo de como deve ficar o EstoqueController.java
package com.anm.estoque.controller;

import com.anm.estoque.model.ProdutoModelo;
import com.anm.estoque.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/produtos")
public class EstoqueController {

    @Autowired
    private ProdutoRepository pr; // Injeção agora deve funcionar

    @GetMapping("/listar")
    public Iterable<ProdutoModelo> listar() {
        // Chamada ao Service
        return pr.findAll(); 
    }
}
