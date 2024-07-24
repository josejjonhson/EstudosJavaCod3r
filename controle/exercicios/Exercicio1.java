package fundamentos.controle.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
//		1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
		
		Scanner in = new Scanner(System.in);

		System.out.print("Informe o número >> ");
		int numero = in.nextInt();
		
		if (numero >= 0 && numero <= 10) {
			System.out.println("O número está entre 0 e 10!");
			if (numero % 2 == 0) {
				System.out.println("O número é Par!");
			} else {
				System.out.println("O número é Impar!");
			}
		} else {
			System.out.println("O número não está entre 0 e 10!");
		}
		
		in.close();
		
	}
}
