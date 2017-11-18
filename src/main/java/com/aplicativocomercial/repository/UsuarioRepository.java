package com.aplicativocomercial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aplicativocomercial.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
