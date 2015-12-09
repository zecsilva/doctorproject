package estilo.estrutura.elementocomposicao;

public class Introducao extends ElementoComposicao {

	private String descricao;

	public Introducao() {
		super("Introdução");
		setDescricao("Introdução");
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Introducao other = (Introducao) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equalsIgnoreCase(other.descricao))
			return false;
		return true;
	}
	
	

}
