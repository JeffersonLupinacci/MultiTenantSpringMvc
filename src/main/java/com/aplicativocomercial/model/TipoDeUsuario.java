package com.aplicativocomercial.model;

public enum TipoDeUsuario {

	ADMINISTRADOR("Administrador"), GERENTE("Gerente"), SUPORTE("Suporte");

	private String descricao;

	TipoDeUsuario(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}