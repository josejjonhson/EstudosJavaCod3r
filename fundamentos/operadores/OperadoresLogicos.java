package fundamentos.operadores;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7; 
		
		System.out.println(condicao1 ^ condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 && condicao2);
		System.out.println(!condicao2);
		// A dupla negação (!!) tem o efeito de cancelamento da negação.
	}
}
