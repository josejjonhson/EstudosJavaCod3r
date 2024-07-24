package fundamentos.controle.copy;

public class For1 {

	public static void main(String[] args) {
		
		for(int c = 0; c < 10; c++) {
			System.out.println("Olá, Mundo!");
		}
		
		// Outra escrita possível:
		int x = 0;
		for(;x < 10;) {
			System.out.println("O valor de x é >> " + x);
			x++;
		}
		
		// For infinito
//		for(;true;) {
//			System.out.println("LOOP");
//		}
		
		// Outra notação do for infinito
		for(;;) {
			System.out.println("OUTRO LOOP");
		}
	}
}
