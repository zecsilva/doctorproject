package estilo.recursos;

import javax.swing.ImageIcon;

import estilo.estrutura.RecursoEstilo;

public class Video extends RecursoEstilo {

	public Video() {
		super();
		setFormatoRecurso("Imagem");
		setNomeRecursoEstilo("Video");
		setImagem(new ImageIcon(getClass().getResource(this.getClass().getSimpleName()+".png")));

		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Vídeo ";
	}

}
