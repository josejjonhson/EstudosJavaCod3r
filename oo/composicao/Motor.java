package oo.composicao;
// Relação um para um
public class Motor {

	final Carro carro;
	
	double fatorInjecao = 1;
	boolean ligado = false; 
	
	Motor(Carro c) {
		this.carro = c;
	}
	
	int giros() {
		if (!ligado) {
			return 0;
		} else {
			return (int) Math.round(fatorInjecao * 3000);
		}
	}
}
