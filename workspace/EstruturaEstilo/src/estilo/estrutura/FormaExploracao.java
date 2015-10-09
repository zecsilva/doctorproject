package estilo.estrutura;

public class FormaExploracao 
{
	private String nomeForma;
	public FormaExploracao(String nome)
	{
		setNomeForma(nome);
	}
	public String getNomeForma() {
		return nomeForma;
	}
	public void setNomeForma(String nomeForma) {
		this.nomeForma = nomeForma;
	}
	@Override
	public String toString() {
		return "Forma de Exploração=" + nomeForma;
	}
}
