package estilo.recursos;

import javax.swing.ImageIcon;

import estilo.estrutura.RecursoEstilo;

public class Foto extends RecursoEstilo {

	public Foto() {
		super();
		setFormatoRecurso("Imagem");
		setNomeRecursoEstilo("Foto");
		setImagem(new ImageIcon(getClass().getResource(this.getClass().getSimpleName()+".png")));

		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Foto";
	}

}
