package fundamentos.controle.copy;

public class SwitchComEscopoDefinido {

	public static void main(String[] args) {

		int x = 1;
		int y = 2;

		switch (x) {
		case 1: {
			switch (y) {
			case 2:
				System.out.println("Entrou no segundo switch!");
			}
		}
		}
	}
}
