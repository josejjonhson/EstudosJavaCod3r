package classe;

public class Produto {

	String nome;
	double preco;
	double desconto;
	
	public double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	public double precoComDescontoEspecial(double descontoDoGerente) {
		return preco * (1 - (desconto + descontoDoGerente));
	}
}
