package estilo.recursos;

import javax.swing.ImageIcon;

import estilo.estrutura.RecursoEstilo;

public class Questionario extends RecursoEstilo {

	public Questionario() {
		super();
		setFormatoRecurso("Texto");
		setNomeRecursoEstilo("Questionario");
		setImagem(new ImageIcon(getClass().getResource(this.getClass().getSimpleName()+".png")));

		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Questionário";
	}

}
