package estilo.estrutura;

import java.util.ArrayList;

public class Estilo 
{
	private String estiloNome;
	private String descricao;
    private ArrayList<RecursoEstilo> recursos;
	private FormaExploracao formaExploracao;
	private OrdemDetalhamento ordemDetalhamento;
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
		return "Estilo = [" + estiloNome + "]" +"\n\nRecursos = " + recursos 
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

	
}
