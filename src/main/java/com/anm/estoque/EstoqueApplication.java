// src/main/java/com/anm/estoque/EstoqueApplication.java
package com.anm.estoque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories; // Import necessário

@SpringBootApplication
// Adicione esta anotação e aponte para o pacote onde o ProdutoRepository está
@EnableJpaRepositories(basePackages = "com.anm.estoque.repository") 
public class EstoqueApplication {

    public static void main(String[] args) {
        SpringApplication.run(EstoqueApplication.class, args);
    }
}
