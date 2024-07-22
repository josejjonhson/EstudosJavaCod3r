package fundamentos.controle;

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
	}
}
