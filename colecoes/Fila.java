package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		 
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Ana");
		fila.offer("Bia"); // Retorna verdadeiro ou falso caso consiga ou não adicionar em uma lista que tenha um limite
		fila.offer("Carlos");
		fila.offer("Miguel");
		fila.offer("Maria");
		fila.offer("Pedro");
		
		System.out.println(fila.peek()); // Não gera exceção, retorna null
		System.out.println(fila.element()); // Gera uma exceção
		
		// fila.size()
		// fila.clear()
		// fila.isEmpty()
		// fila.contains()
		
		System.err.println(fila.poll()); // Remove o elemento retornando ele. Quando não tiver mais itens retorna null
		System.out.println(fila.remove()); // Se chamar quando a lista estiver vazia, levanta uma exceção
	}
}
