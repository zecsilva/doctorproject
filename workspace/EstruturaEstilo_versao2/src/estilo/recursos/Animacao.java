package estilo.recursos;

import javax.swing.ImageIcon;

import estilo.estrutura.RecursoEstilo;

public class Animacao extends RecursoEstilo {

	public Animacao() {
		super();
		setFormatoRecurso("Imagem");
		setNomeRecursoEstilo("Animacao");
		//System.out.println(getClass().getResource(this.getClass().getSimpleName()));
		setImagem(new ImageIcon(getClass().getResource(this.getClass().getSimpleName()+".png")));
		//setImagem(ImageIO.read(new File("img\\" + this.getClass().getName() + ".png")));
	}

	@Override
	public String toString() {
		return "Animação";
	}

	
}
