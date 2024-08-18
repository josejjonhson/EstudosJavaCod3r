package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	final List<Item> listaDeItens = new ArrayList<Item>();
	
	void adicionarItem(Produto p, int quantidade) {
		this.listaDeItens.add(new Item(p, quantidade));
	}
	
	void adicionarItem(String nome, double preco, int quantidade) {
		var produto = new Produto(nome, preco);
		this.listaDeItens.add(new Item(produto, quantidade));
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for (Item item: listaDeItens) {
			total += item.quantidade * item.produto.preco;
		}
		
		return total;
	}
}
