package fundamentos.controle.copy;

public class For2 {

	public static void main(String[] args) {

		// O desafio consiste em criar um for decrescente, que decai em duas unidades do
		// 10 até o 0. Exibir o valor da
		// variável de controle e parar quando chegar em 0.

		for (int controle = 10; controle >= 0; controle -= 2) {
			System.out.println("Contador = " + controle);
		}
	}
}
