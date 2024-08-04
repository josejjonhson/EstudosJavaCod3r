package array;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		int tamanhoArray = notasAlunoA.length;
		double total = 0;
		for (int i = 0; i < tamanhoArray; i++) {
			System.out.println("Nota do aluno -> " + notasAlunoA[i]);
			total += notasAlunoA[i];
		}
		System.out.println("A média do aluno é -> " + total / tamanhoArray);
		
		// Outra forma de definir um array
		double[] notasAlunoB = { 7, 8, 9, 5.7 };
		System.out.println(Arrays.toString(notasAlunoB));
	}
}
