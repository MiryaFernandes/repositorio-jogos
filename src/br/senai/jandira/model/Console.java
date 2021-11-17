package br.senai.jandira.model;

public enum Console {
	
	XBOX360("Xbox 360", 800),
	XBOX_SERIEX("Xbox Serie X", 4350),
	XBOX_SERIES("Xbox Serie S", 2649),
	PS4PRO("PS4 Pro", 4800),
	PS4("PS4", 2564),
	PS5("PS5", 6000),
	NINTENDO_SWITCH("Nintendo Switch", 2300),
	PC("PC", 4000);
	
	private String descricao;
	
	private Console(String descricao, int preco) {
		
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
