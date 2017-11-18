package com.aplicativocomercial.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aplicativocomercial.model.Usuario;
import com.aplicativocomercial.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioResource {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@GetMapping
	public List<Usuario> listarUsuarios() {
		List<Usuario> usuarios = usuarioRepository.findAll();
		return usuarios;
	}

}
