package com.aplicativocomercial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aplicativocomercial.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
