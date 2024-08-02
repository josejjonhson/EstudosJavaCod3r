package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;

	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	Produto() {
		
	}
	
	public double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	public double precoComDescontoEspecial(double descontoDoGerente) {
		return preco * (1 - (desconto + descontoDoGerente));
	}
}
