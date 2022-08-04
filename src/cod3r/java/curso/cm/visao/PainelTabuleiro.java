package cod3r.java.curso.cm.visao;

import java.awt.GridLayout;
import javax.swing.JPanel;
import cod3r.java.curso.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel{
	public PainelTabuleiro(Tabuleiro tabuleiro) {
		setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));
		
		tabuleiro.paraCada(c -> add(new BotaoCampo(c)));
		
		tabuleiro.registrarObservador(e -> {
			// TODO mostrar resultado pro usu�rio
		});
	}
}
