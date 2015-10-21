package estilo.estrutura;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class OrdemComposicao 

{
	private String nomeOrdemComposicao;
    private ArrayList<EtapaConteudo> ordem;

	public OrdemComposicao()
	{
		//setNomeOrdemComposicao();
		this.setOrdem(new ArrayList<EtapaConteudo>());
	}
	
	public OrdemComposicao(String s){
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
		result = prime * result + ((ordem == null) ? 0 : ordem.hashCode());
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
		if (ordem == null) {
			if (other.ordem != null)
				return false;
		} else if (!ordem.equals(other.ordem))
			return false;
		return true;
	}

	
	
}

