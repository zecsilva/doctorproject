package estilo.recursos;

import javax.swing.ImageIcon;

import estilo.estrutura.RecursoEstilo;

public class Experimento extends RecursoEstilo {

	public Experimento() {
		super();
		setFormatoRecurso("Texto");
		setNomeRecursoEstilo("Experimento");
		setImagem(new ImageIcon(getClass().getResource(this.getClass().getSimpleName()+".png")));

		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Experimento";
	}

}
