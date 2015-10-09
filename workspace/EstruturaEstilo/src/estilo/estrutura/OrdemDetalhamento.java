package estilo.estrutura;

public class OrdemDetalhamento
{
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
		return "Ordem de Detalhamento=" + nomeOrdemDetalhamento;
	}
}
