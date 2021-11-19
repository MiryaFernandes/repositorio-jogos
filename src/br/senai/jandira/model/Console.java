package br.senai.jandira.model;

public enum Console {
	
	XBOX360("Xbox 360", 800.00),
	XBOX_SERIEX("Xbox Serie X", 4350.00),
	XBOX_SERIES("Xbox Serie S",2649.00),
	PS4PRO("PS4 Pro", 4800.00),
	PS4("PS4", 2564.00),
	PS5("PS5", 6000.00),
	NINTENDO_SWITCH("Nintendo Switch", 2300.00),
	PC("PC", 4000.00);
	
	private String descricao;
	private double preco;
	
	private Console(String descricao, double preco) {
		
		this.descricao = descricao;
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public double getPreco() {
		return preco;
	}

}
