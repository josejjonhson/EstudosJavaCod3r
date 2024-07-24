package fundamentos.controle.copy;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int totalDeNotas = 0;
		double notasSomadas = 0.0;
		boolean continua = true;
		
		while (continua) {
			System.out.print("Informe uma nota >> ");
			double nota = in.nextDouble();
			if(nota <= 10 && nota >= 0) {
				notasSomadas += nota;
				totalDeNotas++;
			} else if (nota == -1) {
				continua = false;
			} else {
				System.out.println("Nota inválida!");
				System.out.println("Só são permitidos valores de 0 a 10");
			}
		}
		
		System.out.println("A média é : " + notasSomadas / totalDeNotas);

		in.close();
	}
}
