package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("José");
		Usuario u2 = new Usuario("Maria");
		Usuario u3 = new Usuario("Pedro");
		lista.add(u1);
		lista.add(u2);
		lista.add(u3);
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(2)); // toString 
		
		for (Usuario u: lista) {
			System.out.println(u); // Usando o toString
		}
		
		// Para remover elementos eu posso usar o índice ou objeto
		lista.remove(1); // Retorna o objeto que foi removido
		System.out.println(lista.remove(new Usuario("Manu"))); // Retorna boolean
		
		System.out.println(lista.contains(new Usuario("Manu")));
	}
}
