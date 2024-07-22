package fundamentos.controle;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe um número");
		int num = in.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("O número é Par!");
		} else {
			System.out.println("O número é Impar!");
		}
		
	}
}
