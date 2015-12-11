package estilo.recursos;

import javax.swing.ImageIcon;

import estilo.estrutura.RecursoEstilo;

public class Narracao extends RecursoEstilo {

	public Narracao() {
		super();
		setFormatoRecurso("Texto");
		setNomeRecursoEstilo("Narracao");
		setImagem(new ImageIcon(getClass().getResource(this.getClass().getSimpleName()+".png")));

		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Narração";
	}
	

}
