package fundamentos.controle.exercicios;

import java.util.Scanner;

public class Exercicio7 {
	
//	Criar um programa que enquanto estiver recebendo números positivos, imprime 
//	no console a soma dos números inseridos, caso receba um número negativo, 
//	encerre o programa. Tente utilizar a estrutura do while.
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int soma = 0;
		
		while (true) {
			System.out.print("Informe um número >> ");
			int num = in.nextInt();
			if (num >= 0) {
				soma += num;
				System.out.println("A soma até agora é: " + soma);
			} else {
				break;
			}
			
		}

		in.close();
	}
}
