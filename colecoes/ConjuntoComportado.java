package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		Set<String> lista = new HashSet<String>();
		lista.add("José Jonhson");
		lista.add("Pedro");
		lista.add("Maria Vitória");
		
		for (String nome: lista) {
			System.out.println(nome);
		}
		
		/**
		 * OBS.:
		 * Podemos usar o TreeSet para garantir a ordem de inserção
		 */
		
		Set<Integer> numeros = new HashSet<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		
		for (Integer numero: numeros) {
			System.out.println(numero);
		}
	}
}

