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
		primeiro.setObservacoes("Ainda não concluido.");
		versao1.gravar(primeiro, 0);
        
		Jogos segundo = new Jogos();
		segundo.setNome("Devil may cry");
		segundo.setValor(140);
		segundo.setConsole(Console.NINTENDO_SWITCH);
		segundo.setObservacoes("Ainda não concluido.");
		versao1.gravar(segundo, 1);
		
		System.out.println(versao1.listarJogos(0).getNome());
		System.out.println(versao1.listarJogos(0).getConsole());
		System.out.println(versao1.listarJogos(1).getNome());
        
 		
	}

}
