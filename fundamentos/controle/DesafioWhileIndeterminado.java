package fundamentos.controle;

import java.util.Scanner;

public class DesafioWhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String repete = null;
		while(!"parar".equalsIgnoreCase(repete)) {
 			System.out.println("Entrando no loop novamente!");
			System.out.print("Digite alguma coisa >> ");
			repete = in.nextLine();
		}
		
		System.out.println("Saiu do loop!");
		
		in.close();
	}
}
