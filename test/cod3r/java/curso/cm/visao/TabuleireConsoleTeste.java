package cod3r.java.curso.cm.visao;


import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import cod3r.java.curso.cm.exececao.SairException;
import cod3r.java.curso.cm.modelo.Tabuleiro;

public class TabuleireConsoleTeste {
	private TabuleiroConsole tabuleiro;
	@Test
	void iniciar() {
		Tabuleiro novoTabuleiro = new Tabuleiro(2,2,2);
		tabuleiro = new TabuleiroConsole(novoTabuleiro);
	}
	
	@Test
	void sair() {
		assertThrows(SairException.class, () ->{
			iniciar();
		});
	}
}
