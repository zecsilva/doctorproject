package estilo.estrutura;

/**
 * @model
 */
public class OrdemDetalhamento
{
	/**
	 * @model
	 */
	private String nomeOrdemDetalhamento;

	public OrdemDetalhamento(String nome)
	{
		setNomeOrdemDetalhamento(nome);
	}

	public String getNomeOrdemDetalhamento() {
		return nomeOrdemDetalhamento;
	}

	public void setNomeOrdemDetalhamento(String nomeOrdemDetalhamento) {
		this.nomeOrdemDetalhamento = nomeOrdemDetalhamento;
	}

	@Override
	public String toString() {
		return "Ordem de Detalhamento = [" + nomeOrdemDetalhamento + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeOrdemDetalhamento == null) ? 0 : nomeOrdemDetalhamento.hashCode());
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
		OrdemDetalhamento other = (OrdemDetalhamento) obj;
		if (nomeOrdemDetalhamento == null) {
			if (other.nomeOrdemDetalhamento != null)
				return false;
		} else if (!nomeOrdemDetalhamento.equalsIgnoreCase(other.nomeOrdemDetalhamento))
			return false;
		return true;
	}

	
}
