package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("josé");
		
		Compra c1 = new Compra();
		c1.adicionarItem("Caneta", 10, 100);
		c1.adicionarItem(new Produto("Notebook", 2000), 1);
		
		Compra c2 = new Compra();
		c2.adicionarItem("Caderno", 50, 100);
		c2.adicionarItem(new Produto("SSD NVME", 600), 1);
		
		cliente.adicionarCompra(c1);
		cliente.adicionarCompra(c2);
		
		System.out.println(cliente.obterValorTotal());
	}
}
