package estilo.recursos;

import javax.swing.ImageIcon;

import estilo.estrutura.RecursoEstilo;

public class Mapa extends RecursoEstilo {

	public Mapa() {
		super();
		setFormatoRecurso("Imagem");
		setNomeRecursoEstilo("Mapa");
		setImagem(new ImageIcon(getClass().getResource(this.getClass().getSimpleName()+".png")));

		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Mapa";
	}

}
