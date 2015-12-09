package estilo.estrutura;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 * @model
 */
public class SubEtapaConteudo {
	/**
	 * @model
	 */
private String nome;
/**
 * @model containment="true" opposite= "subEtapas"
 */
private EtapaConteudo etapaConteudo;

DefaultMutableTreeNode nodo;


public SubEtapaConteudo(String nome, EtapaConteudo etapaConteudo) {
	super();
	this.nome = nome;
	this.etapaConteudo = etapaConteudo;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

@Override
public String toString() {
	return nome;
}

public EtapaConteudo getEtapaConteudo() {
	return etapaConteudo;
}

public void setEtapaConteudo(EtapaConteudo etapaConteudo) {
	this.etapaConteudo = etapaConteudo;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((etapaConteudo == null) ? 0 : etapaConteudo.hashCode());
	result = prime * result + ((nome == null) ? 0 : nome.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	SubEtapaConteudo other = (SubEtapaConteudo) obj;
	if (etapaConteudo == null) {
		if (other.etapaConteudo != null)
			return false;
	} else if (!etapaConteudo.equals(other.etapaConteudo))
		return false;
	if (nome == null) {
		if (other.nome != null)
			return false;
	} else if (!nome.equals(other.nome))
		return false;
	return true;
}

public DefaultMutableTreeNode getNodo() {
	return nodo;
}

public void setNodo(DefaultMutableTreeNode nodo) {
	this.nodo = nodo;
}


}
