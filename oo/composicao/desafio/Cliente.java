package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	final String nome;
	final List<Compra> listaDeCompras = new ArrayList<Compra>();
	
	Cliente(String nome) {
		this.nome = nome;
	}
	
	void adicionarCompra(Compra c) {
		this.listaDeCompras.add(c);
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for (Compra compra: listaDeCompras) {
			total += compra.obterValorTotal();
		}
		
		return total;
	}
}
