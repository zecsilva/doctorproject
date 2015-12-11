package estilo.recursos;

import javax.swing.ImageIcon;

import estilo.estrutura.RecursoEstilo;

public class Esquema extends RecursoEstilo {

	public Esquema() {
		super();
		setFormatoRecurso("Imagem");
		setNomeRecursoEstilo("Esquema");
		setImagem(new ImageIcon(getClass().getResource(this.getClass().getSimpleName()+".png")));

		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Esquema";
	}

}
