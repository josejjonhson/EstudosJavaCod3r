package fundamentos.operadores;

public class DesafioOperadoresLogicos {

	public static void main(String[] args) {
		
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		/**
		 * Se os dois trabalhos derem certo uma televisão de 50 polegadas será comprada.
		 * Se apenas um dos trabalhos der certo será comprada uma televisão de 32 polegadas.
		 * Independente de qual televisão seja comprada, a familia vai tomar sorvete.
		 * Se nenhum dos trabalho der certo, nenhum dos cenários vai acontecer.
		 */
		
		boolean trabalho01 = false;
		boolean trabalho02 = false;
		boolean tomarSorvete = trabalho01 || trabalho02;
		boolean televisao50 = trabalho01 && trabalho02;
		boolean televisao32 = trabalho01 ^ trabalho02; // Exemplo de utilização do (Ou exclusivo)
		
		System.out.println("O trabalho 1 deu certo?:" + trabalho01);
		System.out.println("O trabalho 2 deu certo?:" + trabalho02);
		System.out.println("Teve sorvete?:" + tomarSorvete);
		System.out.println("A televisão de 50 polegadas foi comprada?:" + televisao50);
		System.out.println("A televisão de 32 polegadas foi comprada?:" + televisao32);
		
		System.out.println("Mais saudável?:" + !tomarSorvete);
	}
}
