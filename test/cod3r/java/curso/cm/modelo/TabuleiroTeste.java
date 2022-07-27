package cod3r.java.curso.cm.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TabuleiroTeste {

	private Tabuleiro tabuleiro;
	@BeforeEach
	void iniciar() {
		tabuleiro = new Tabuleiro(4,4,3);
	}
	@Test
	void marcar() {
		tabuleiro.alternarMarcacao(1, 1);
	}
	
	@Test
	void reiniciar() {
		tabuleiro.reiniciar();
	}
	
	@Test
	void objetivoAlcancadoFalse() {
		boolean obj = tabuleiro.objetivoAlcancado();
		assertFalse(obj);
	}
	@Test
	void objetivoAlcancadoTrue() {
		tabuleiro.abrir(0, 0);
		tabuleiro.abrir(0, 1);
		tabuleiro.abrir(0, 2);
		tabuleiro.abrir(0, 3);
		tabuleiro.abrir(0, 4);
		tabuleiro.abrir(1, 0);
		tabuleiro.abrir(1, 1);
		tabuleiro.abrir(1, 2);
		tabuleiro.abrir(1, 3);
		tabuleiro.abrir(1, 4);
		tabuleiro.abrir(2, 0);
		tabuleiro.abrir(2, 1);
		tabuleiro.abrir(2, 2);
		tabuleiro.abrir(2, 3);
		tabuleiro.abrir(2, 4);
		tabuleiro.abrir(3, 0);
		tabuleiro.abrir(3, 1);
		tabuleiro.abrir(3, 2);
		tabuleiro.abrir(3, 3);
		tabuleiro.abrir(3, 4);
		tabuleiro.abrir(4, 0);
		tabuleiro.abrir(4, 1);
		tabuleiro.abrir(4, 2);
		tabuleiro.abrir(4, 3);
		tabuleiro.abrir(4, 4);
		boolean obj = tabuleiro.objetivoAlcancado();
		assertTrue(obj);
	}
	
	@Test
	void campoString() {
		tabuleiro.toString();
	}
	
}
