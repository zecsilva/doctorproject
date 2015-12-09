package estilo.layoutinterface;

import javax.swing.tree.DefaultMutableTreeNode;

public class Nodo extends DefaultMutableTreeNode {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Nodo(String nome) {
		super();
		this.nome = nome;
	}
	
	

}
