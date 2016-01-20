package estilo.estrutura;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

import javax.swing.tree.DefaultMutableTreeNode;

import estilo.recursos.Animacao;

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

private int nivelEspecificidade;

private HashMap<Integer, RecursoEstilo> mapLblRecurso;

public SubEtapaConteudo(String nome, EtapaConteudo etapaConteudo) {
	super();
	this.nome = nome;
	this.etapaConteudo = etapaConteudo;
}

public boolean hasFormato(String formato){
	Set<Integer> lbls = this.getMapLblRecurso().keySet();
	for (Integer i : lbls){
		RecursoEstilo r = this.getMapLblRecurso().get(i);
		if (r.getFormatoRecurso().equalsIgnoreCase(formato))
			return true;
	}
	return false;

}

public Integer hasAnimacao(){
	ArrayList<Integer> indices = new ArrayList<Integer>();
	Set<Integer> lbls = this.getMapLblRecurso().keySet();
	
	for (Integer i : lbls){
		RecursoEstilo r = this.getMapLblRecurso().get(i);
		if (r instanceof Animacao)
			indices.add(i);
	}
	
	Random r = new Random();
	if (!indices.isEmpty()){
		int j = r.nextInt(indices.size());
		return indices.get(j);
	} else
		return -1;
}

public ArrayList<Integer> getIndicesFormato(String formato){
	Set<Integer> lbls = this.getMapLblRecurso().keySet();
	ArrayList<Integer> arrayInt = new ArrayList<Integer>();
	for (Integer i : lbls){
		RecursoEstilo r = this.getMapLblRecurso().get(i);
		if (r.getFormatoRecurso().equalsIgnoreCase(formato))
			arrayInt.add(i);
	}
	return arrayInt;

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

public int getNivelEspecificidade() {
	return nivelEspecificidade;
}

public void setNivelEspecificidade(int nivelEspecificidade) {
	this.nivelEspecificidade = nivelEspecificidade;
}


public HashMap<Integer, RecursoEstilo> getMapLblRecurso() {
	return mapLblRecurso;
}

public void setMapLblRecurso(HashMap<Integer, RecursoEstilo> mapLblRecurso) {
	this.mapLblRecurso = mapLblRecurso;
}


}
