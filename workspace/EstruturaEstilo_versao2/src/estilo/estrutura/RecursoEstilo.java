package estilo.estrutura;

import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

/**
 * @model
 */
public class RecursoEstilo 
{
	/**
	 * @model
	 */
	private String nomeRecursoEstilo;
	/**
	 * @model
	 */
	private String formatoRecurso;
	
	private ImageIcon imagem;
	/*public RecursoEstilo(String nome)
	{
		setNomeRecursoEstilo(nome);
	} */
	public String getNomeRecursoEstilo() {
		return nomeRecursoEstilo;
	}
	public void setNomeRecursoEstilo(String nomeRecursoEstilo) {
		this.nomeRecursoEstilo = nomeRecursoEstilo;
	}
	public String getFormatoRecurso() {
		return formatoRecurso;
	}
	public void setFormatoRecurso(String formatoRecurso) {
		this.formatoRecurso = formatoRecurso;
	}
	@Override
	public String toString() {
		return "nomeRecursoEstilo";
	}
	public ImageIcon getImagem() {
		return imagem;
	}
	public void setImagem(ImageIcon imagem) {
		this.imagem = imagem;
	}
	
}
