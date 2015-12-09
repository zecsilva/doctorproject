package estilo.estrutura;

public class TesteEstilo 
{
	public static void main(String[] args) 
	{
	String e1="Ativo";	
	Estilo e = new Estilo(e1);
    EstilosKB kb = new EstilosKB();
    kb.tell(e);
    kb.run();
    
    System.out.println(e);
    
	}

}
