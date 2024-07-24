package fundamentos.controle.exercicios;

import java.util.Scanner;

public class Exercicio4 {
//	Criar um programa que receba um número e diga se ele é um número primo.
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Digite um número inteiro positivo e maior que 1: ");
		int num = in.nextInt();

		boolean ehPrimo = true;

		if (num <= 1) {
			ehPrimo = false;
		} else {
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
