package fundamentos.controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	/**
	 * 
	 * @param args
	 * @author jonhson O desafio consiste em criar um programa que leia o nome do
	 *         dia da semana e informe o númeto correspondente.
	 */

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Informe o dia da semana >> ");
		String dia = in.nextLine();

		if ("Domingo".equals(dia)) {
			System.out.println("1");
		} else if ("Segunda".equals(dia)) {
			System.out.println("2");
		} else if ("Terça".equals(dia)) {
			System.out.println("3");
		} else if ("Quarta".equals(dia)) {
			System.out.println("4");
		} else if ("Quinta".equals(dia)) {
			System.out.println("5");
		} else if ("Sexta".equals(dia)) {
			System.out.println("6");
		} else if ("Sábado".equals(dia)) {
			System.out.println("7");
		} else {
			System.out.println("Dia da semana inválido!");
			System.out.println("Verifique se você escreveu corretamente nome para o dia da semana!");
		}

		in.close();
	}
}
