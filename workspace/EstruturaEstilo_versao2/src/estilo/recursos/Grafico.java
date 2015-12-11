package estilo.recursos;

import javax.swing.ImageIcon;

import estilo.estrutura.RecursoEstilo;

public class Grafico extends RecursoEstilo {

	public Grafico() {
		super();
		setFormatoRecurso("Imagem");
		setNomeRecursoEstilo("Grafico");
		setImagem(new ImageIcon(getClass().getResource(this.getClass().getSimpleName()+".png")));

		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Gráfico";
	}

}
