package br.senai.jandira.app;

import br.senai.jandira.model.Console;
import br.senai.jandira.model.Jogos;
import br.senai.jandira.repository.JogoRepository;

public class App {

	public static void main(String[] args) {
		
		JogoRepository versao1 = new JogoRepository(2);
		
		Jogos primeiro = new Jogos();
		primeiro.setNome("Farcry 4");
		primeiro.setValor(140);
		primeiro.setConsole(Console.NINTENDO_SWITCH);
		primeiro.setObservacoes("Um pouco complicado.");
		primeiro.setConcluido(true);
		versao1.gravar(primeiro, 0);
		
        
		Jogos segundo = new Jogos();
		segundo.setNome("Devil may cry");
		segundo.setValor(140);
		segundo.setConsole(Console.NINTENDO_SWITCH);
		segundo.setObservacoes("Bem divertido.");
		versao1.gravar(segundo, 1);
		
		System.out.println(primeiro.getNome());
		System.out.println(primeiro.getConsole());
		System.out.println(segundo.getNome());
        System.out.println(segundo.getObservacoes());
        System.out.println(primeiro.isConcluido());
 		
	}

}
