package classe;

public class EqualsEHashcode {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "José Jonhson";
		u1.nome = "Teste@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "José Jonhson";
		u2.nome = "Teste@gmail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2)); // Todo objeto tem o equals disponível para uso
		
		// System.out.println(u2.equals(new Data()));
	}
}
