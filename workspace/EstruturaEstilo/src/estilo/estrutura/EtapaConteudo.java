package estilo.estrutura;

public class EtapaConteudo {
private String nome;


public EtapaConteudo(String nome) {
	super();
	this.nome = nome;
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


}
