package oo.heranca.desafio;

public class Carro {

	int velocidadeAtual = 10;
	
	void frear() {
		if (velocidadeAtual > 0) {
				velocidadeAtual -= 5;
		}
	}
	
	void acelerar() {
		if (velocidadeAtual < 250) {
			velocidadeAtual += 5;
		}
	}
}
