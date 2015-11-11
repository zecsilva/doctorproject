package estilo.estrutura;

/**
 * @model
 */
public class FormaExploracao 
{
	/**
	 * @model
	 */
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
		return "Forma de Exploração = [" + nomeForma+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeForma == null) ? 0 : nomeForma.hashCode());
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
		FormaExploracao other = (FormaExploracao) obj;
		if (nomeForma == null) {
			if (other.nomeForma != null)
				return false;
		} else if (!nomeForma.equalsIgnoreCase(other.nomeForma))
			return false;
		return true;
	}
	
	
}
