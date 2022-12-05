package com.sample.api.enums;

public enum TipoNomeCursoEnum {

	DESENVOLVIMENTO_SOFTWARE("DESENVOLVIMENTO DE SOFTWARE"), 
	ENGENHARIA_COMPUTACAO("ENGENHARIA DA COMPUTAÇÃO");

	private final String descricao;

	TipoNomeCursoEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
