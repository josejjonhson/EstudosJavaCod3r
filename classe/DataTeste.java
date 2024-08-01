package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data(12, 12, 2003);
		d1.dia = 12;
		d1.mes = 12;
		d1.ano = 2003;
		
		Data d2 = new Data();
		
		String dataFormatada1 = "Primeira data formatada: " + d1.obterDataFormatada();
		String dataFormatada2 = "Segunda data formatada: " + d2.obterDataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.println(dataFormatada2);
	}
}
