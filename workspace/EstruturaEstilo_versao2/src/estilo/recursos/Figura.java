package estilo.recursos;

import javax.swing.ImageIcon;

import estilo.estrutura.RecursoEstilo;

public class Figura extends RecursoEstilo {

	public Figura() {
		super();
		setFormatoRecurso("Imagem");
		setNomeRecursoEstilo("Figura");
		setImagem(new ImageIcon(getClass().getResource(this.getClass().getSimpleName()+".png")));

		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Figura";
	}

}
