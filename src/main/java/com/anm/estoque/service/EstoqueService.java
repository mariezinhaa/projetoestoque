package com.anm.estoque.service;

import com.anm.estoque.model.ProdutoModelo;
import com.anm.estoque.repository.ProdutoRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstoqueService {

    @Autowired
    private ProdutoRepository pr;

    public Iterable<ProdutoModelo> listar(){
        return pr.findAll();
    }

   }
