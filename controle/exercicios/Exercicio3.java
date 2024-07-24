package fundamentos.controle.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

//		Criar um programa que receba duas notas parciais, calcular a média final. 
//		Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", se a nota for
//		menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", 
//		caso contrário imprime no console "Reprovado".

		Scanner in = new Scanner(System.in);

		System.out.println("Informe a primeira nota");
		double nota1 = in.nextDouble();
		System.out.println("Informe a segunda nota");
		double nota2 = in.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media <= 4) {
			System.out.println("Reprovado!");
		} else if (media > 4 && media < 7) {
			System.out.println("Recupeção!");
		} else {
			System.out.println("Aprovado!");
		}
		
		in.close();
	}
}
