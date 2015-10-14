package estilo.estrutura;

import java.util.ArrayList;

public class OrdemComposicao 

{
	private String nomeOrdemComposicao;
    private ArrayList<EtapaConteudo> ordem;

	public OrdemComposicao()
	{
		//setNomeOrdemComposicao();
		this.setOrdem(new ArrayList<EtapaConteudo>());
	}

	public String getNomeOrdemComposicao() 
	{
		return nomeOrdemComposicao;
	}

	public void setNomeOrdemComposicao(String nomeOrdemComposicao) 
	{
		this.nomeOrdemComposicao = nomeOrdemComposicao;
	}

	public ArrayList<EtapaConteudo> getOrdem() {
		return ordem;
	}

	public void setOrdem(ArrayList<EtapaConteudo> ordem) {
		this.ordem = ordem;
	}

	@Override
	public String toString() {
		return "Ordem de Composicao = " + ordem;
	}


	
}

