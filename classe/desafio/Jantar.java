package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		
		Comida c1 = new Comida("Feijão", 0.500);
		Pessoa p1 = new Pessoa("José", 90);
		
		System.out.println(p1.nome + " " + p1.peso);
		p1.comer(c1);
		System.out.println(p1.nome + " " + p1.peso);
	}
}
