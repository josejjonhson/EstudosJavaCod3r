package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	// No caso de constantes eu até posso declarar ela sem inicializar
	final int teste;
	// Porém, eu tenho que inicializar ela até que o objeto seja criado, pois não é 
	// atribuido a ela um valor padrão
	
	Data() {
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		// O this também pode ser usado para chamar outro construtor
		this(12, 12, 2012); // O que determina qual construtor está sendo chamado é a quantidade de parâmetros
		// Só pode ser usado dentro de um construtor
		
		// Valores padrão de cada tipo de variável
		// byte, short, int, long -> 0
		// float, double -> 0.0
		// bolean -> false
		// char -> '\u0000'
		// objetos -> null (não aponta para nenhum local de memória)
		
		/**
		 * OBS.:
		 * Variáveis locais não são inicializadas por padrão.
		 * Apenas as variáveis de instância e de classe que são.
		 */
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		teste = 12; // Aqui está a inicialização da constante "teste"
	}
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	// Essa notação deve ser evitada, chamar um println dentro de uma função faz com que ela fique limitada
	void imprimirDataFormatada() {
		System.out.printf(obterDataFormatada());
	}
}
