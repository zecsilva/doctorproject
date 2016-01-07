package estilo.layoutinterface.exibirrecursos;

import java.util.Random;

import javax.swing.Icon;
import javax.swing.JLabel;

import estilo.util.Constantes;

public class MostrarRecurso extends JLabel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private MostrarRecurso cima;
	private MostrarRecurso baixo;
	private MostrarRecurso direita;
	private MostrarRecurso esquerda;
	
	private int indice;
	
	public MostrarRecurso() {
		super();
	}
	
	public MostrarRecurso(int indice){
		super();
		this.indice = indice;
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
	
	public MostrarRecurso getVizinhoAleatorioDisponivel(){
		MostrarRecurso mR = null;
		int i = -1;
		Random r = new Random();

		while (mR == null || mR.getIcon() != null){
			i = r.nextInt(4);			
			switch (i){
				case 0:
					mR = this.getCima();
					break;
				case 1:
					mR = this.getBaixo();
					break;
				case 2:
					mR = this.getDireita();
					break;
				case 3:
					mR = this.getEsquerda();
					break;
			}
		}
		return mR;
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

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	
}
