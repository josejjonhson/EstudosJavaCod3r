package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "Guitarra";
		p1.preco = 2500.00;
		p1.desconto = 0.10;
		
		var p2 = new Produto();
		p2.nome = "Violão";
		p2.preco = 2000.00;
		p2.desconto = 0.25;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.preco * (1 - p1.desconto);
		double precoFinal2 = p2.preco * (1 - p2.desconto);
		System.out.println("Média do carrinho de compras: R$" + (precoFinal1 + precoFinal2) / 2);
	}
}
