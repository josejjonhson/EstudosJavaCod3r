package oo.heranca.desafio;

public class Main {

	public static void main(String[] args) {
		
		Carro c1 = new Maverick();
		System.out.println(c1.velocidadeAtual);
		c1.acelerar();
		System.out.println(c1.velocidadeAtual);
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		System.out.println(c1.velocidadeAtual);
		
		System.out.println();
		
		Carro c2 = new Fusca();
		System.out.println(c2.velocidadeAtual);
		c2.acelerar();
		System.out.println(c2.velocidadeAtual);
		c2.frear();
		c2.frear();
		c2.frear();
		c2.frear();
	
		System.out.println(c2.velocidadeAtual);
	}
}
