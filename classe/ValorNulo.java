package classe;

public class ValorNulo {

	public static void main(String[] args) {

		String s1 = "";
		System.out.println(s1.concat("!!!!"));

		Data d1 = Math.random() > 0.5 ? new Data() : null; 

		// Caso eu queira garantir que a variável não esteja nula para fazer algo:
		if (d1 != null) {
			d1.mes = 3;
		}

		String s2 = Math.random() > 0.5 ? new String("Opa") : null;
		if (s2 != null) {
			System.out.println(s2.concat("????"));
		}
		
		// Tentar acessar atributos ou métodos de um objeto que esteja null gera um erro
		// Runtime Error
		
	}
}
