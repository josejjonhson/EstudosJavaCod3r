package fundamentos.exercicios;

import java.util.Scanner;

public class DesafioQuadradoCubo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe um número");
		double num = in.nextDouble();
		
		double quadrado = Math.pow(num, 2);
		double cubo = Math.pow(num, 3);
		
		System.out.println("O quadrado de " + num + " é >> " + quadrado);
		System.out.println("O cubo de " + num + " é >> " + cubo);
		
		in.close();
	}
}
