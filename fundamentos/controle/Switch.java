package fundamentos.controle;

public class Switch {

	public static void main(String[] args) {

		// Forma menos usual do switch(sem break)
		String faixa = "amarela";

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei fazer o Tekki Sandan e Tekki Nidan!");
		case "roxa":
			System.out.println("Sei o Tekki Shodan!");
		case "verde":
			System.out.println("Sei fazer o Heian Godan!");
		case "laranja":
			System.out.println("Sei fazer o Heian Yodan!");
		case "vermelha":
			System.out.println("Sei fazer o Heian Sandan!");
		case "amarela":
			System.out.println("Sei fazer o Heian Nidan!");
		case "branca":
			System.out.println("Sei fazer o Heian Shodan!");
			break;
		default:
			System.out.println("Não sei nada!");
		}
		
		System.out.println("Fim!");
	}
}
