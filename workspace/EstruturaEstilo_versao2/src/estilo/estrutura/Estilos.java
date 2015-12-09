package estilo.estrutura;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Estilos {
	private Map<Estilo,Integer> count = new HashMap<Estilo,Integer>();
	private Map<Estilo, Double> percent = new HashMap<Estilo, Double>();
	
	ArrayList<Estilo> itens;

	public Estilos() {
		super();
		this.itens = new ArrayList<Estilo>();
		this.count = new HashMap<Estilo,Integer>();
		this.percent = new HashMap<Estilo, Double>();
	}
	
	public void addItens(String s){
		String[] t = s.split (Pattern.quote (","));
		for (String o: t){
			Estilo estilo = new Estilo(o);
			itens.add(estilo);
			addEstiloMap(estilo);
		}
	}


	public ArrayList<Estilo> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Estilo> itens) {
		this.itens = itens;
	}

	@Override
	public String toString() {
		String s = new String();
		for (Estilo e : itens){
			s = s + e.getEstiloNome() + " ; ";
		}
		return s;
	}
	

	public void addEstiloMap( Estilo estilo  ) { 
		if( !count.containsKey( estilo ) ){
			count.put( estilo, 1 );
		} else { 
			count.put( estilo, count.get( estilo ) + 1 );
		}
		addPercentMap();
	}
	
	public void addPercentMap() {
		percent = new HashMap<Estilo, Double>();
		int total = itens.size();
		for (Estilo e: count.keySet()){
			int n = count.get(e);
			double pc = n * 100 / total;
			percent.put(e, pc);
		}
	}
	
	public int getCount( Estilo estilo ) { 
		if( ! count.containsKey( estilo ) ) {
			return 0;
		}
		return count.get( estilo );
	}

		
	public String mostrarQtdes(){
		String s = "";
		for (Estilo e : this.count.keySet()){
			System.out.println(e.getEstiloNome().toUpperCase() + " - " + this.count.get(e));
			s = s + e.getEstiloNome().toUpperCase() + "  -  " + this.count.get(e) +  "   -> porcentagem:   " + percent.get(e) + "%\n";
		}
		s = s + "\nTOTAL DE INFERÊNCIAS: " + itens.size();
		return s;
	}

	
	
}
