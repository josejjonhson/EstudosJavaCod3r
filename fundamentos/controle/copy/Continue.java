package fundamentos.controle.copy;

public class Continue {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i % 2  == 0) {
				continue;
			}
			System.out.println(i);
		}
		
		// Quero exibir todos os valores menos o elemento 5
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}
		
		// Outra notação
		for (int i = 0; i < 10; i++) {
			if (i == 5) continue;
			System.out.println(i);
		}
	}
}
