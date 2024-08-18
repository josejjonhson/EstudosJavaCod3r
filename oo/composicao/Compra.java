package oo.composicao;

import java.util.ArrayList;

public class Compra {

	String cliente; // Em uma situação real não seria uma String aqui, mas sim um outro objeto
					// Cliente
	ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	void adicionarProduto(Produto p) {
		produtos.add(p);
		p.compra = this;
	}
	
	void adicionarProduto(String nome, int quantidade, double preco) {
		this.adicionarProduto(new Produto(nome, quantidade, preco));
	}
	
	double getValorTotal() {
		double total = 0;
		
		for(Produto produto: produtos) {
			total += produto.quantidade * produto.preco;
		}
		
		return total;
	}
}
