package estilo.recursos;

import javax.swing.ImageIcon;

import estilo.estrutura.RecursoEstilo;

public class Tabela extends RecursoEstilo {

	public Tabela() {
		super();
		setFormatoRecurso("Imagem");
		setNomeRecursoEstilo("Tabela");
		setImagem(new ImageIcon(getClass().getResource(this.getClass().getSimpleName()+".png")));

		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Tabela";
	}
}
