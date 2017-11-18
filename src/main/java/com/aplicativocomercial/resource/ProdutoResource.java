package com.aplicativocomercial.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aplicativocomercial.model.Produto;
import com.aplicativocomercial.repository.ProdutoRepository;

@RestController
@RequestMapping("/{IdEmpresa}/produtos")
public class ProdutoResource {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping
	public List<Produto> listarProdutos(){
		List<Produto> produtos = produtoRepository.findAll();
		return produtos;
	}	
	
}