package fundamentos.controle;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		for(boolean controle = true; controle;) {
			System.out.println(valor);
			valor += "#";
			if("######".equals(valor)) {
				controle = false;
			}
		}
	}
}
