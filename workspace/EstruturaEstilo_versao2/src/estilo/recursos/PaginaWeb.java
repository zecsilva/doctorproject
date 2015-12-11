package estilo.recursos;

import javax.swing.ImageIcon;

import estilo.estrutura.RecursoEstilo;

public class PaginaWeb extends RecursoEstilo {

	public PaginaWeb() {
		super();
		setFormatoRecurso("Texto");
		setNomeRecursoEstilo("PaginaWeb");
		setImagem(new ImageIcon(getClass().getResource(this.getClass().getSimpleName()+".png")));

		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Página Web";
	}

}
