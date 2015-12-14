package estilo.layoutinterface.exibirrecursos;

import javax.swing.Icon;
import javax.swing.JLabel;

public class MostrarRecurso extends JLabel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private MostrarRecurso cima;
	private MostrarRecurso baixo;
	private MostrarRecurso direita;
	private MostrarRecurso esquerda;
	
	public MostrarRecurso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MostrarRecurso(Icon image, int horizontalAlignment) {
		super(image, horizontalAlignment);
		// TODO Auto-generated constructor stub
	}

	public MostrarRecurso(Icon image) {
		super(image);
		// TODO Auto-generated constructor stub
	}

	public MostrarRecurso(String text, Icon icon, int horizontalAlignment) {
		super(text, icon, horizontalAlignment);
		// TODO Auto-generated constructor stub
	}

	public MostrarRecurso(String text, int horizontalAlignment) {
		super(text, horizontalAlignment);
		// TODO Auto-generated constructor stub
	}

	public MostrarRecurso(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	public MostrarRecurso getCima() {
		return cima;
	}

	public void setCima(MostrarRecurso cima) {
		this.cima = cima;
	}

	public MostrarRecurso getBaixo() {
		return baixo;
	}

	public void setBaixo(MostrarRecurso baixo) {
		this.baixo = baixo;
	}

	public MostrarRecurso getDireita() {
		return direita;
	}

	public void setDireita(MostrarRecurso direita) {
		this.direita = direita;
	}

	public MostrarRecurso getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(MostrarRecurso esquerda) {
		this.esquerda = esquerda;
	}

	
}
