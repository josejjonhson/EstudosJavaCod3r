package array;

import java.util.Scanner;

public class DesafioNotas {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Quantas notas você quer calcular?");
		int quantidadeNotas = in.nextInt();
		
		double[] notas = new double[quantidadeNotas];
		
		for (int i = 0; i < quantidadeNotas; i++) {
			System.out.println("Informe a nota do aluno.");
			double nota = in.nextDouble();
			notas[i] = nota;
		}
		
		double soma = 0;
		for (double nota: notas) {
			soma += nota;
		}
		
		System.out.println("A média das notas é -> " + soma / quantidadeNotas);
		
		in.close();
	}
}
