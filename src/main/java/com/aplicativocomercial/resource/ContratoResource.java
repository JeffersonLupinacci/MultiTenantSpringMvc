package com.aplicativocomercial.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aplicativocomercial.model.Contrato;
import com.aplicativocomercial.repository.ContratoRepository;

@RestController
@RequestMapping("/contratos")
public class ContratoResource {

	@Autowired
	private ContratoRepository contratoRepository;
	
	@GetMapping
	public List<Contrato> listarContratos(){
		List<Contrato> contratos = contratoRepository.findAll();
		return contratos;
	}	
	
}
