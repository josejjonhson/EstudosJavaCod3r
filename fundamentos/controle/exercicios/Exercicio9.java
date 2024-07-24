package fundamentos.controle.exercicios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int maiorNumero = 0;
		int controle = 0;
		int contador = 0;
		
		do {
			System.out.print("Informe um numero >> ");
			controle = in.nextInt();
			if (controle > maiorNumero) {
				maiorNumero = controle;
			}
			contador++;
		} while (contador < 10) ;
		
		System.out.println("Maior número: " + maiorNumero);
		
		in.close();
	}
}
