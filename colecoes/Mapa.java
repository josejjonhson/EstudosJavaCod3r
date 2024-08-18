package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		usuarios.put(1, "José"); // Adiciona se não existir e substitui caso exista
		usuarios.put(2, "José Jonhson");
		usuarios.put(3, "Maria");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet()); // Não ordenada
		System.out.println(usuarios.values()); // Valores
		System.out.println(usuarios.entrySet()); // Chave e valor ao mesmo tempo
		
		System.out.println(usuarios.containsKey(2));
		System.out.println(usuarios.containsValue("José"));
		
		// Obter chave a partir do valor
		System.out.println(usuarios.get(3));
		
		// Remover a partir da chave
		System.out.println(usuarios.remove(2)); // Retorna o valor
		System.out.println(usuarios.remove(2, "Jonas")); // Posso tentar remover por chave valor
		
		// Formas de percorrer um map
		// Chave
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		// Valor
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> usuario: usuarios.entrySet()) {
			System.out.print(usuario.getKey() + " ==> ");
			System.out.println(usuario.getValue());
		}
	}
}
