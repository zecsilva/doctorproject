package estilo.recursos;

import javax.swing.ImageIcon;

import estilo.estrutura.RecursoEstilo;

public class Simulacao extends RecursoEstilo {

	public Simulacao() {
		super();
		setFormatoRecurso("Imagem");
		setNomeRecursoEstilo("Simulacao");
		setImagem(new ImageIcon(getClass().getResource(this.getClass().getSimpleName()+".png")));

		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Simulação";
	}

}
