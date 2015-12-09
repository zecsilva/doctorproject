package estilo.modelo;

import estilo.estrutura.Estilo;

public class ModeloEA {

	private String nomeModelo;

	private String descricaoModelo;
	
	private Autor autor;
	
	private Dimensao dimensao;
	
	private FormaDeteccao formaDeteccao;
	
	private InstrumentoInvestigacao instrumentoInvestigacao;
	
	private Estilo estilo;

	public ModeloEA(String nomeModelo, String descricaoModelo, Autor autor, Dimensao dimensao,
			FormaDeteccao formaDeteccao, InstrumentoInvestigacao instrumentoInvestigacao, Estilo estilo) {
		super();
		this.nomeModelo = nomeModelo;
		this.descricaoModelo = descricaoModelo;
		this.autor = autor;
		this.dimensao = dimensao;
		this.formaDeteccao = formaDeteccao;
		this.instrumentoInvestigacao = instrumentoInvestigacao;
		this.estilo = estilo;
	}
	
	

}
