package cod3r.java.curso.cm.modelo;
@FunctionalInterface
public interface CampoObservador {
	
	public void eventoOcorreu(Campo campo, CampoEvento evento);
}
