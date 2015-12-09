package estilo.estrutura;

import java.util.ArrayList;

import estilo.estrutura.elementocomposicao.Atividade;
import estilo.estrutura.elementocomposicao.Avaliacao;
import estilo.estrutura.elementocomposicao.Desenvolvimento;
import estilo.estrutura.elementocomposicao.ElementoComposicao;
import estilo.estrutura.elementocomposicao.Introducao;
import estilo.estrutura.elementocomposicao.Resumo;

/**
 * @model
 */
public class EtapaConteudo {
	/**
	 * @model
	 */
private ElementoComposicao elementoComposicao;

/**
 * @model containment="true" opposite="etapaConteudo"
 */
private ArrayList<SubEtapaConteudo> subEtapas;


public EtapaConteudo(String nome) {
	super();
	if (nome.equalsIgnoreCase("Atividade"))
		this.elementoComposicao = new Atividade();
	if (nome.equalsIgnoreCase("Avaliação"))
		this.elementoComposicao = new Avaliacao();
	if (nome.equalsIgnoreCase("Desenvolvimento"))
		this.elementoComposicao = new Desenvolvimento();
	if (nome.equalsIgnoreCase("Introdução"))
		this.elementoComposicao = new Introducao();
	if (nome.equalsIgnoreCase("Resumo"))
		this.elementoComposicao = new Resumo();
	
	subEtapas = new ArrayList<SubEtapaConteudo>();
}


@Override
public String toString() {
	return elementoComposicao.toString();
}

public ArrayList<SubEtapaConteudo> getSubEtapas() {
	return subEtapas;
}

public void setSubEtapas(ArrayList<SubEtapaConteudo> subEtapas) {
	this.subEtapas = subEtapas;
}





@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((elementoComposicao == null) ? 0 : elementoComposicao.hashCode());
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
	EtapaConteudo other = (EtapaConteudo) obj;
	if (elementoComposicao == null) {
		if (other.elementoComposicao != null)
			return false;
	} else if (!elementoComposicao.equals(other.elementoComposicao))
		return false;
	return true;
}


public ElementoComposicao getElementoComposicao() {
	return elementoComposicao;
}

public void setElementoComposicao(ElementoComposicao elementoComposicao) {
	this.elementoComposicao = elementoComposicao;
}


}
