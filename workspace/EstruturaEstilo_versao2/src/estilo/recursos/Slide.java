package estilo.recursos;

import javax.swing.ImageIcon;

import estilo.estrutura.RecursoEstilo;

public class Slide extends RecursoEstilo {

	public Slide() {
		super();
		setFormatoRecurso("Texto");
		setNomeRecursoEstilo("Slide");
		setImagem(new ImageIcon(getClass().getResource(this.getClass().getSimpleName()+".png")));

		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Slide";
	}

}
