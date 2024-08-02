package classe;

public class TesteVariavelEstatica {

	final static int ID = 13;
	int valor;
	
	public TesteVariavelEstatica(int valor) {
		this.valor = valor;
	}
	
	public static void main(String[] args) {
	
		TesteVariavelEstatica t1 = new TesteVariavelEstatica(1000);
		TesteVariavelEstatica t2 = new TesteVariavelEstatica(5000);
		
		System.out.println("ID t1 = " + TesteVariavelEstatica.ID);
		System.out.println("ID t2 = " + TesteVariavelEstatica.ID);
		System.out.println("valor t1 = " + t1.valor);
		System.out.println("valor t2 = " + t2.valor);
	}
}
