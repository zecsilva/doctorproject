package estilo.recursos;

import javax.swing.ImageIcon;

import estilo.estrutura.RecursoEstilo;

public class AutoAvaliacao extends RecursoEstilo {

	public AutoAvaliacao() {
		super();
		setFormatoRecurso("Texto");
		setNomeRecursoEstilo("AutoAvaliacao");
		setImagem(new ImageIcon(getClass().getResource(this.getClass().getSimpleName()+".png")));

		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Auto-Avaliação";
	}

}
