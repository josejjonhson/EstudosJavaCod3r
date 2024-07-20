package fundamentos;

public class DesafioOperadoresAritmeticos {

	public static void main(String[] args) {
		
		// Requisitos
//		int a = 3 * 4 - 10;
//		int b = (int) Math.pow(a, 3);
//		double c = Math.pow(a, 3);
//		System.out.println(b);
//		System.out.println(c);
		
		double sistemaUm = (Math.pow(6 * (3 + 2), 2)) / (3 * 2);
		double sistemaDois = Math.pow(((1 - 5) * (2 - 7)) / 2, 2);
		double resultado = (Math.pow(sistemaUm - sistemaDois, 3) / Math.pow(10, 3));
		System.out.println(resultado);
		
		// Caso precise de um casting 
		int resultadoInteiro = (int) resultado;
		System.out.println(resultadoInteiro);
	}
}
