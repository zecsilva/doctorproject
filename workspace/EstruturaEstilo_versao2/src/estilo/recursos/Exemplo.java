package estilo.recursos;

import javax.swing.ImageIcon;

import estilo.estrutura.RecursoEstilo;

public class Exemplo extends RecursoEstilo {

	public Exemplo() {
		super();
		setFormatoRecurso("Texto");
		setNomeRecursoEstilo("Exemplo");
		setImagem(new ImageIcon(getClass().getResource(this.getClass().getSimpleName()+".png")));

		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Exemplo";
	}

}
