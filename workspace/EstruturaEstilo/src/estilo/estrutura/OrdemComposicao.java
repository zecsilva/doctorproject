package estilo.estrutura;

import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 * @model
 */
public class OrdemComposicao 

{
	/**
	 * @model
	 */
	private String nomeOrdemComposicao;
	/**
	 * @model
	 */
    private ArrayList<EtapaConteudo> ordem;

	public OrdemComposicao()
	{
		//setNomeOrdemComposicao();
		this.setOrdem(new ArrayList<EtapaConteudo>());
	}
	
	public OrdemComposicao(String s){
		nomeOrdemComposicao = s;
		ordem = new ArrayList<EtapaConteudo>();
		String[] t = s.split (Pattern.quote ("->"));
		for (String o: t){
			EtapaConteudo etapa = new EtapaConteudo(o);
			ordem.add(etapa);
		}
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeOrdemComposicao == null) ? 0 : nomeOrdemComposicao.hashCode());
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
		OrdemComposicao other = (OrdemComposicao) obj;
		if (nomeOrdemComposicao == null) {
			if (other.nomeOrdemComposicao != null)
				return false;
		} else if (!nomeOrdemComposicao.equalsIgnoreCase(other.nomeOrdemComposicao))
			return false;
		return true;
	}

	

	
	
}

