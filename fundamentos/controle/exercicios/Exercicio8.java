package fundamentos.controle.exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.print("Informe uma palavra >> ");
		String palavra = in.nextLine();
		
		for (int i = 0; i < palavra.length(); i++) {
			char caractere = palavra.charAt(i);
			System.out.println(caractere);
		}

		in.close();
	}
}
