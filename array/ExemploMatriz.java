package array;

import java.util.Arrays;
import java.util.Scanner;

public class ExemploMatriz {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Quantos alunos tem na turma? >> ");

		int quantidadeDeAlunosTurma = in.nextInt();

		System.out.print("Quantas notas cada aluno tem? >> ");

		int quantidadeDeNotasAluno = in.nextInt();

		double[][] notasDaTurma = new double[quantidadeDeAlunosTurma][quantidadeDeNotasAluno];
		
		double total = 0;
		for (int i = 0; i < notasDaTurma.length; i++) { // O i representa o aluno
			for (int j = 0; j < notasDaTurma[i].length; j++) { // O j representa a nota
				
				System.out.printf("Qual a nota %d do aluno %d? >> ", (j + 1), (i + 1));
				notasDaTurma[i][j] = in.nextDouble();
				total += notasDaTurma[i][j];
			}
		}
		
		double mediaFinal = total / (quantidadeDeAlunosTurma * quantidadeDeNotasAluno);
		System.out.println("A média da turma é " + mediaFinal);
		
		for (double[] notasDoAluno: notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
		in.close();
	}
}
