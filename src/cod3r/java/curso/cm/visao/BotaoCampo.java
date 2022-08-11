package cod3r.java.curso.cm.visao;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import cod3r.java.curso.cm.modelo.Campo;
import cod3r.java.curso.cm.modelo.CampoEvento;
import cod3r.java.curso.cm.modelo.CampoObservador;

@SuppressWarnings("serial")
public class BotaoCampo extends JButton implements CampoObservador, MouseListener{
	Campo campo;
	
	private final Color BG_PADRAO = new Color(184, 184, 184);
	private final Color BG_MARCADO = new Color(6, 0, 43);
	private final Color BG_EXPLODIR = new Color(255, 195, 195);
	private final Color TEXTO_VERDE = new Color(0, 100, 0);
	private final ImageIcon bomba = new ImageIcon(getClass().getResource("/cod3r/java/curso/cm/img/bomb.png"));
	private final ImageIcon bandeira = new ImageIcon(getClass().getResource("/cod3r/java/curso/cm/img/bandeira.png"));

	
	BotaoCampo(Campo campo){
		this.campo = campo; 
		setBackground(BG_PADRAO);
		setOpaque(true);
		setBorder(BorderFactory.createBevelBorder(0));
		addMouseListener(this);
		campo.registrarObservador(this);
	}
	
	@Override
	public void eventoOcorreu(Campo campo, CampoEvento evento) {
		switch(evento) {
		case ABRIR:
			aplicarEstiloAbrir();
			break;
		case MARCAR:
			aplicarEstiloMarcar();
			break;
		case EXPLODIR:
			aplicarEstiloExplodir();
			break;
		default:
			aplicarEstiloPadrao();
		}
		SwingUtilities.invokeLater(() -> {
			repaint();
			validate();
		});
	}

	private void aplicarEstiloPadrao() {
		setBackground(BG_PADRAO);
		setBorder(BorderFactory.createBevelBorder(0));
		setText("");
		setIcon(null);
	}

	private void aplicarEstiloExplodir() {
		setBackground(BG_EXPLODIR);
		setIcon(bomba);
	}

	private void aplicarEstiloMarcar() {
		setBackground(BG_MARCADO);
		setForeground(Color.BLACK);
		setIcon(bandeira);
		
	}

	private void aplicarEstiloAbrir() {
		setBorder(BorderFactory.createLineBorder(Color.GRAY));
		
		if(campo.isMinado()) {
			setBackground(BG_EXPLODIR);
			setIcon(bomba);
			return;
		}
		
		setBackground(BG_PADRAO);
		switch (campo.minasNaVizinhanca()) {
		case 1:
			setForeground(TEXTO_VERDE);
			break;
		case 2:
			setForeground(Color.BLUE);
			break;
		case 3:
			setForeground(Color.YELLOW);
			break;
		case 4:
		case 5:
		case 6:
			setForeground(Color.RED);
			break;
		default: 
			setForeground(Color.PINK);
		}
		String valor = !campo.vizinhancaSegura()? campo.minasNaVizinhanca() +"":"";
		setText(valor);
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getButton() == 1) {
			campo.abrir();
		}else {
			campo.alternarMarcacao();
		}
		
	}
	
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
	
}
