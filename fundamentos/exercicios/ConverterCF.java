package fundamentos.exercicios;

import java.util.Scanner;

public class ConverterCF {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Informe a temperatura em Celsius que deseja converter para Fahrenheit >> ");
		double temperaturaCelsius = in.nextDouble();
		
		double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
		
		System.out.printf("%.2f°C equivalem a %.2f°F", temperaturaCelsius, temperaturaFahrenheit);
		
		in.close();
	}
}
