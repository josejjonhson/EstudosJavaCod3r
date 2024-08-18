package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "José Jonhson";
		compra1.adicionarProduto("Creatina", 2, 100.00);
		compra1.adicionarProduto(new Produto("Termogênico", 1, 80.00));
		compra1.adicionarProduto(new Produto("whey protein", 2, 180.00));
		
		System.out.println(compra1.produtos.size());
		System.out.println("O valor total é: " + compra1.getValorTotal());
	}
}
