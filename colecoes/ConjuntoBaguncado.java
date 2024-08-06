package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.5); // double -> Double (Converte os tipo primitivo para as respectivas classes)
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		conjunto.add("José");
		
		System.out.println("O tamanho do conjunto é: " + conjunto.size());
		
		conjunto.add("Teste");
		System.out.println("O tamanho do conjunto é: " + conjunto.size());
		// O tamanho do conjunto continua o mesmo uma vez que ele não aceita dados repetidos
		
		System.out.println(conjunto.remove(true));
		
		System.out.println("O conjunto contem o elemento Z?: " + conjunto.contains("Z"));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		// União entre conjuntos
		conjunto.addAll(nums);
		System.out.println(conjunto); // Não é respeitada a ordem de adição
		
		Set nomes = new HashSet();
		nomes.add("José");
		nomes.add("Pedro");
		nomes.add("João");
		
		// Interseção entre conjuntos
		conjunto.retainAll(nomes);
		System.out.println(conjunto);
		
		// Limpar conjunto
		conjunto.clear();
		System.out.println(conjunto);
	}	
}
