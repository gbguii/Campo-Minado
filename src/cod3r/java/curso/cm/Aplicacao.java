package cod3r.java.curso.cm;

import cod3r.java.curso.cm.modelo.Tabuleiro;
import cod3r.java.curso.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(7, 6, 3);
		new TabuleiroConsole(tabuleiro);
	}

}
