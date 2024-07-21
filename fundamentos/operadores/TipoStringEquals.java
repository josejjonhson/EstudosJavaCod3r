package fundamentos.operadores;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		String s1 = new String("2");
		System.out.println("2" == s1);
		
		System.out.println("2".equals(s1));
		
		Scanner in = new Scanner(System.in);
		
		String s2 = in.next(); // O next() já retira os espaços em branco
		System.out.println("2" == s2.trim()); // Retira espaços em branco
		
		// Quando for comparar Strings devemos fazer a utilização do equals() em vez do "=="
		
		in.close();
	}
}
