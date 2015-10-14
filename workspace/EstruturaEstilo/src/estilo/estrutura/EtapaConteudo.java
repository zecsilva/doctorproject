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


}
