package estilo.modelo;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import estilo.estrutura.Estilo;
import estilo.estrutura.EstilosKB;

public class GerarXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModeloEA modelo = new ModeloEA("nome modelo", "descri��o modelo", 
				new Autor("nome autor", "descri��o autor"), 
				new Dimensao("nome dimens�o", "descri��o dimens�o"), 
				new FormaDeteccao("descri��o detec��o", "nome detec��o", "tipo detec��o"), 
				new InstrumentoInvestigacao("nome instrumento investiga��o", "descri��o instrumento investiga��o"),
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
