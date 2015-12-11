package estilo.recursos;

import javax.swing.ImageIcon;

import estilo.estrutura.RecursoEstilo;

public class Palestra extends RecursoEstilo {

	public Palestra() {
		super();
		setFormatoRecurso("Imagem");
		setNomeRecursoEstilo("Palestra");
		setImagem(new ImageIcon(getClass().getResource(this.getClass().getSimpleName()+".png")));

		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Palestra";
	}

}
