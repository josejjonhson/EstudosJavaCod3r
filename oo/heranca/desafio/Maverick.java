package oo.heranca.desafio;

public class Maverick extends Carro{

	void acelerar() {
		if (velocidadeAtual < 250) {
			velocidadeAtual += 15;
		}
	}
}
