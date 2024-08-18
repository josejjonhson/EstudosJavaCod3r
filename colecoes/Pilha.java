package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		// Comportamento LIFO
		// O último que entrou vai ser o primeiro a sair
		
		Deque<String> livros = new ArrayDeque<String>();
		
		// Adicionar
		livros.add("O Pequeno Príncipe"); // Retorna verdadeiro ou falso
		livros.push("Dom Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		// Remover
		System.out.println(livros.poll());
		System.out.println(livros.remove());
		System.out.println(livros.pop()); // Lança uma exceção caso não tenha elemento na pilha para remover
		
		// Outros métodos que já vimos nas colections
//		livros.size();
//		livros.clear();
//		livros.contains();
//		livros.isEmpty();
		
		livros.push("O Hobbit");
		livros.push("O Hobbit");
		livros.push("O Hobbit");
		livros.push("O Hobbit");
		livros.push("O Hobbit");
		livros.push("O Hobbit");
		
		for(String livro: livros) {
			System.out.println("Livro: " + livro);
		}
		
	}
}
