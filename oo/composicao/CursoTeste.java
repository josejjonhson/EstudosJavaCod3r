package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("José");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");
		
		Curso curso1 = new Curso("Ciência da Computação");
		Curso curso2 = new Curso("Engenharia de Software");
		Curso curso3 = new Curso("Sistemas da Informação");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno2);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for(Aluno aluno: curso1.alunos) {
			System.out.println("Estou matriculado no curso 1...");
			System.out.println("E o meu nome é " + aluno.nome);
			System.out.println();
		}
		
		for(Aluno aluno: curso2.alunos) {
			System.out.println("Estou matriculado no curso 2...");
			System.out.println("E o meu nome é " + aluno.nome);
			System.out.println();
		}
		
		for(Aluno aluno: curso3.alunos) {
			System.out.println("Estou matriculado no curso 3...");
			System.out.println("E o meu nome é " + aluno.nome);
			System.out.println();
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Ciência da Computação");
		
		if (cursoEncontrado != null) {
			System.out.println(cursoEncontrado.alunos);
		} else {
			System.out.println("Curso não encontrado!");
		}
	}
}
