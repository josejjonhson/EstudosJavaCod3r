package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	// Essa notação deve ser evitada, chamar um println dentro de uma função faz com que ela fique limitada
	void imprimirDataFormatada() {
		System.out.printf(obterDataFormatada());
	}
}
