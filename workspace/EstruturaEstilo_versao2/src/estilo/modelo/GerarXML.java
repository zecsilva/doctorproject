package estilo.modelo;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import estilo.estrutura.Estilo;
import estilo.estrutura.EstilosKB;

public class GerarXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModeloEA modelo = new ModeloEA("nome modelo", "descrição modelo", 
				new Autor("nome autor", "descrição autor"), 
				new Dimensao("nome dimensão", "descrição dimensão"), 
				new FormaDeteccao("descrição detecção", "nome detecção", "tipo detecção"), 
				new InstrumentoInvestigacao("nome instrumento investigação", "descrição instrumento investigação"),
				retornarEstilo("ativo"));
		XStream stream = new XStream(new DomDriver());
		System.out.println(stream.toXML(modelo));
	}
	
	protected static Estilo retornarEstilo(String nomeEstilo) {
		Estilo e = new Estilo(nomeEstilo);
	    EstilosKB kb = new EstilosKB();
	    kb.tell(e);
	    kb.run();
	    
		return e;
	}

}
