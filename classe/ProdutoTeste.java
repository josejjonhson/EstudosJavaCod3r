package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Guitarra", 1200.50);
		
		var p2 = new Produto("Violão Strinberg", 2000.0);
		
		Produto.desconto = 0.50;
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		System.out.println("Média do carrinho de compras: R$" + (precoFinal1 + precoFinal2) / 2);
		
		System.out.println();
	}
}
