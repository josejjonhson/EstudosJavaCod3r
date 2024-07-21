package fundamentos.operadores;

import javax.swing.JOptionPane;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		String num1 = JOptionPane.showInputDialog("Informe o primeiro número!");
		String num2 = JOptionPane.showInputDialog("Informe o segundo número!");
		
		double num1Int = Double.valueOf(num1).doubleValue();
		double num2Int = Double.valueOf(num2).doubleValue();
		
		JOptionPane.showMessageDialog(null, "+ = Adição\n- = Subtração\n / = Divisão\n * = Multiplicação");
		
		String op = JOptionPane.showInputDialog("Informe o simbolo da operação que você deseja fazer!");
		
		double resultado = "+".equals(op) ? num1Int + num2Int : 0;
		resultado = "-".equals(op) ? num1Int - num2Int : resultado;
		resultado = "*".equals(op) ? num1Int * num2Int : resultado;
		resultado = "/".equals(op) ? num1Int / num2Int : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1Int, op, num2Int, resultado);
	}
}
