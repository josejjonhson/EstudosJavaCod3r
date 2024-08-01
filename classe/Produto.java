package classe;

public class Produto {

	String nome;
	double preco;
	double desconto;

	Produto(String nomeInicial) {
		this.nome = nomeInicial;
	}
	
	Produto() {
		
	}
	
//	void Produto() {
//		
//	}
//	Ao colcoar o void, passa a ser um método e não um construtor. 
	
	public double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	public double precoComDescontoEspecial(double descontoDoGerente) {
		return preco * (1 - (desconto + descontoDoGerente));
	}
}
