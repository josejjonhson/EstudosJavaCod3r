package fundamentos.exercicios;

import java.util.Scanner;

public class ConverterFC {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Informe a temperatura em Fahrenheit que deseja converter para Celsius >> ");
		double temperaturaFahrenheit = in.nextDouble();
		
		double temperaturaCelsius = (temperaturaFahrenheit - 32) / 1.8;
		
		System.out.printf("%.2f°F equivalem a %.2f°C", temperaturaFahrenheit, temperaturaCelsius);
		
		in.close();
	}
}
