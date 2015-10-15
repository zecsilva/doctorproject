package estilo.estrutura;

import java.util.ArrayList;

public class EtapaConteudo {
private String nome;
private ArrayList<SubEtapaConteudo> subEtapas;


public EtapaConteudo(String nome) {
	super();
	this.nome = nome;
	subEtapas = new ArrayList<SubEtapaConteudo>();
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
	EtapaConteudo other = (EtapaConteudo) obj;
	if (nome == null) {
		if (other.nome != null)
			return false;
	} else if (!nome.equals(other.nome))
		return false;
	return true;
}


}
