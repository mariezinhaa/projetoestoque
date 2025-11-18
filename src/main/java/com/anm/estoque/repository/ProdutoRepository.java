package com.anm.estoque.repository;




import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.anm.estoque.model.ProdutoModelo;



@Repository
public interface ProdutoRepository extends CrudRepository<ProdutoModelo, Long> {
    
}

