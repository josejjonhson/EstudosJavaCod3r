package fundamentos.controle.exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

//		Criar um programa informa se o ano atual é um ano bissexto;

		Scanner in = new Scanner(System.in);

		System.out.print("Informe o ano que você quer saber se foi bissexto >> ");
		String anoString = in.nextLine();

//		int tamanhoDaString = anoString.length();
//		String ultimosDigitos = anoString.substring(tamanhoDaString - 2, tamanhoDaString);
//		int ultimosDigitosInteiros = Integer.parseInt(ultimosDigitos);
		int anoInteiro = Integer.parseInt(anoString);

		if (anoInteiro % 4 == 0) {
			if (anoInteiro % 100 == 0) {
				if (anoInteiro % 400 == 0) {
					System.out.println("Foi um ano bissexto!");
				} else {
					System.out.println("Não foi um ano bissexto!");
				}
			} else {
				System.out.println("Foi um ano bissexto!");
			}
		} else {
			System.out.println("Não foi um ano bissexto!");
		}

		in.close();

	}
}
