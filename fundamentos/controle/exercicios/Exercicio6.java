package fundamentos.controle.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		
		int numRandom = random.nextInt(101);
		int tentativas = 10;
		int palpite = 0;
		
		boolean acertou = false;
		
		while (tentativas > 0) {
			System.out.println("VOCÊ TEM " + tentativas + " TENTATIVAS RESTANTES");
			System.out.print("Informe o seu palpite >> ");
			palpite = in.nextInt();
			tentativas--;
			
			if (palpite == numRandom) {
				acertou = true;
				break;
			} else if (palpite > numRandom) {
				System.out.println("Essa foi quase!");
				System.out.println("O número que você informou é maior!!!");
				System.out.println("Tente novamente!");
			} else {
				System.out.println("Essa foi quase!");
				System.out.println("O número que você informou é menor!!!");
				System.out.println("Tente novamente!");
			}
		}
		
		if (acertou) {
			System.out.println("Parabéns!\nNumero escondido: " + numRandom + "\nSeu palpite: " + palpite);
			System.out.println("Quantidade de tentativas restantes: " + tentativas);
		} else {
			System.out.println("Infelizmente você perdeu!");
			System.out.println("O número escondido era: " + numRandom);
		}
		
		in.close();
	}
}
