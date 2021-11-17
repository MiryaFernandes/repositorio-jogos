package br.senai.jandira.repository;

import br.senai.jandira.model.Jogos;

public class JogoRepository {
	
	private Jogos[] compilado;
	
	public JogoRepository() {
		
		compilado = new Jogos[30];
	}
	
	public JogoRepository(int quantidadeJogos) {
		
		compilado = new Jogos[quantidadeJogos];
	}
	public void gravar(Jogos jogo, int posicao) {
		
		compilado[posicao] = jogo;
	}
	public Jogos listarJogos(int posicao) {
		
		return compilado[posicao];
	}
	public Jogos[] listarTodods() {
		
		return compilado;
	}

}
