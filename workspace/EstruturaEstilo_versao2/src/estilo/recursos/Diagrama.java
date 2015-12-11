package estilo.recursos;

import javax.swing.ImageIcon;

import estilo.estrutura.RecursoEstilo;

public class Diagrama extends RecursoEstilo {

	public Diagrama() {
		super();
		setFormatoRecurso("Imagem");
		setNomeRecursoEstilo("Diagrama");
		setImagem(new ImageIcon(getClass().getResource(this.getClass().getSimpleName()+".png")));

		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return " Diagrama";
	}

}
