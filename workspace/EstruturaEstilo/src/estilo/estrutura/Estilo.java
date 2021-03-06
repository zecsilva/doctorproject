package estilo.estrutura;

import java.util.ArrayList;

/**
 * @model
 */
public class Estilo 
{
	/**
	 * @model
	 */
	private String estiloNome;
	/**
	 * @model
	 */
	private String descricao;
	/**
	 * @model
	 */
    private ArrayList<RecursoEstilo> recursos;
    /**
     * @model
     */
	private FormaExploracao formaExploracao;
	/**
	 * @model
	 */
	private OrdemDetalhamento ordemDetalhamento;
	/**
	 * @model
	 */
	private OrdemComposicao ordemComposicao;
    
	public Estilo(String nome)
	{
		setEstiloNome(nome);
		recursos = new ArrayList<RecursoEstilo>();
	}
    
	
  
	/*public String toString() {
	 * return String.format(" %s\n %s\n %s\n %s\n %s\n %s\n", "Estilo: " + estiloNome ,  
			"Ordem Composição = " + ordemComposicao,
			"Recursos=" + recursos
			, "Forma de Exploracao: " + formaExploracao, "Ordem de Detalhamento: " + ordemDetalhamento); */
	
    public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public ArrayList<RecursoEstilo> getRecursos() {
		return recursos;
	}

	public void setRecursos(ArrayList<RecursoEstilo> recursos) {
		this.recursos = recursos;
	}

	

	public String getDesricao() {
		return descricao;
	}

	public void setDesricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEstiloNome() {
		return estiloNome;
	}

	public void setEstiloNome(String estiloNome) {
		this.estiloNome = estiloNome;
	}

	public FormaExploracao getFormaExploracao() {
		return formaExploracao;
	}

	public void setFormaExploracao(FormaExploracao formaExploracao) {
		this.formaExploracao = formaExploracao;
	}

	public OrdemDetalhamento getOrdemDetalhamento() {
		return ordemDetalhamento;
	}

	public void setOrdemDetalhamento(OrdemDetalhamento ordemDetalhamento) {
		this.ordemDetalhamento = ordemDetalhamento;
	}

	public OrdemComposicao getOrdemComposicao() {
		return ordemComposicao;
	}

	public void setOrdemComposicao(OrdemComposicao ordemComposicao) {
		this.ordemComposicao = ordemComposicao;
	}



	@Override
	public String toString() {
		return "Estilo = [" + estiloNome + "]" + "\n\nRecursos = " + recursos 
				+ "\n\n" + formaExploracao + "\n\n" + ordemDetalhamento
				+ "\n\n" + ordemComposicao ;
	}



	public SubEtapaConteudo getSubEtapaByName(String name){
		for (EtapaConteudo etapa : this.getOrdemComposicao().getOrdem()){
			for (SubEtapaConteudo subEtapa : etapa.getSubEtapas()){
				if (subEtapa.getNome().equalsIgnoreCase(name))
					return subEtapa;
			}
		}
		return null;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estiloNome == null) ? 0 : estiloNome.hashCode());
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
		Estilo other = (Estilo) obj;
		if (estiloNome == null) {
			if (other.estiloNome != null)
				return false;
		} else if (!estiloNome.equals(other.estiloNome))
			return false;
		return true;
	}

	
}
