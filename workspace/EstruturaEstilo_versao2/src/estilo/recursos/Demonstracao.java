package estilo.recursos;

import javax.swing.ImageIcon;

import estilo.estrutura.RecursoEstilo;

public class Demonstracao extends RecursoEstilo {

	public Demonstracao() {
		super();
		setFormatoRecurso("Texto");
		setNomeRecursoEstilo("Demonstracao");
		setImagem(new ImageIcon(getClass().getResource(this.getClass().getSimpleName()+".png")));

		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Demonstração";
	}

}
