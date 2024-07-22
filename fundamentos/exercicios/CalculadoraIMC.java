package fundamentos.exercicios;

import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe a sua altura em metros quadrados");
		final double ALTURA = in.nextDouble();
		System.out.println("Informe o seu peso em Kg");
		final double PESO = in.nextDouble();
		final double IMC = PESO / (Math.pow(ALTURA, 2)); 
		
		System.out.printf("Seu IMC é >> %.2f", IMC);
		
		in.close();
	}
}
