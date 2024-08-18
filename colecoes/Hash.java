package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("José"));
		usuarios.add(new Usuario("Maria"));
		usuarios.add(new Usuario("Pedro"));
		
		// Se eu comentar o método hashCode da classe Usuario ele não reconhece o Pedro
		// O hashCode é a primeira coisa que ele varre, para depois comparar com o equals
		System.out.println(usuarios.contains(new Usuario("Pedro")));
	}
}
