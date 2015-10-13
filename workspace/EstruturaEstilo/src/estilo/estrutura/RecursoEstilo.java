package estilo.estrutura;

public class RecursoEstilo 
{
	private String nomeRecursoEstilo;
	private String formatoRecurso;
	/*public RecursoEstilo(String nome)
	{
		setNomeRecursoEstilo(nome);
	} */
	public String getNomeRecursoEstilo() {
		return nomeRecursoEstilo;
	}
	public void setNomeRecursoEstilo(String nomeRecursoEstilo) {
		this.nomeRecursoEstilo = nomeRecursoEstilo;
	}
	public String getFormatoRecurso() {
		return formatoRecurso;
	}
	public void setFormatoRecurso(String formatoRecurso) {
		this.formatoRecurso = formatoRecurso;
	}
	@Override
	public String toString() {
		return "nomeRecursoEstilo";
	}
	
}
