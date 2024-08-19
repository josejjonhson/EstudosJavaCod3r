package oo.heranca;

public class Heroi extends Jogador {

	// Chamei o método pai duas vezes
	boolean atacar(Jogador oponente) {
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		return ataque1 || ataque2;
	}
	
	// Outra solução:

//	boolean atacar(Jogador oponente) {
//
//		int deltaX = Math.abs(x - oponente.x);
//		int deltaY = Math.abs(y - oponente.y);
//
//		if (deltaX == 0 && deltaY == 1) {
//			oponente.vida -= 20;
//			return true;
//		} else if (deltaY == 1 && deltaX == 0) {
//			oponente.vida -= 20;
//			return true;
//		} else {
//			return false;
//		}
//	}

}
