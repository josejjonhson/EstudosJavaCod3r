package fundamentos.controle.copy;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// Ctrl + Shift + o organiza os imports

		String texto = "";

		do {
			System.out.println("Você precisa falar as palavras mágicas...");
			System.out.println("Quer sair???");
			texto = in.nextLine();
		} while (!texto.equalsIgnoreCase("por favor"));

		System.out.println("Obrigado!");
		
		in.close();
	}
}
