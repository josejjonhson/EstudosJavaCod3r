package fundamentos.exercicios;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe a base do triângulo");
		final double BASE = in.nextDouble();
		System.out.println("Informe a altura do triângulo");
		final double ALTURA = in.nextDouble();
		
		final double AREA = (BASE * ALTURA) / 2;
		
		System.out.printf("A área do triângulo é: %.2f", AREA);
		
		in.close();
	}
}
