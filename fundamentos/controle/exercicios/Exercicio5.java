package fundamentos.controle.exercicios;

import java.util.Scanner;

public class Exercicio5 {
//	Refatorar o exercício 04, utilizando a estrutura switch.
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Digite um número inteiro positivo e maior que 1: ");
		int num = in.nextInt();

		boolean ehPrimo = true;

		switch (num) {
		case 0:
		case 1:
			ehPrimo = false;
			break;
		case 2:
		case 3:
			ehPrimo = true;
			break;
		default:
			ehPrimo = true;
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					ehPrimo = false;
					break;
				}
			}
		}

		if (ehPrimo) {
			System.out.println(num + " é primo.");
		} else {
			System.out.println(num + " não é primo.");
		}

		in.close();

	}
}
