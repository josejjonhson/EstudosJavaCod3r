package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // Atribuição por valor (Tipo Primitivo)
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1, 1, 24);
		Data d2 = d1; // Atribuição por referência (Objeto)
		
		d1.dia = 31;
		d2.dia = 23;
		 
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}
	
	// Um método estático só consegue acessar outro método estático	
	// O que é passado no caso de objetos é a referência, gerando assim um impacto
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	// Uma cópia é passada, sendo assim, não é gerado impacto no valor da variável
	static void alterarPrimitivo(int a) {
		a++;
	}
}
