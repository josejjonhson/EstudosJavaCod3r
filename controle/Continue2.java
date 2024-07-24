package fundamentos.controle;

public class Continue2 {

	public static void main(String[] args) {

		// Ter cuidado com a utilização que vai ser mostrada aqui.
		// Devemos evitar!!!

		externo: for (int i = 0; i < 3; i++) { // Rotulamos o for externo e queremos que o break atue nele.
			for (int j = 0; j < 3; j++) {

				if (i == 1) {
					continue externo;
				}

				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
		System.out.println("FIM!");
	}
}
