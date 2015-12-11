package estilo.recursos;

import javax.swing.ImageIcon;

import estilo.estrutura.RecursoEstilo;

public class Exercicio extends RecursoEstilo {

	public Exercicio() {
		super();
		setFormatoRecurso("Texto");
		setNomeRecursoEstilo("Exercicio");
		setImagem(new ImageIcon(getClass().getResource(this.getClass().getSimpleName()+".png")));

		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Exercicio";
	}

}
