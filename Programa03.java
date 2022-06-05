//salvar como Programa03.java
import javax.swing.*;

class Programa03
{	
	public static void main (String entrada[])
	{
		//declaração de variáveis
		int n1, n2;
		int div;
		double pot;
		String msg = "";
		
		//entrada de dados
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:" ));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro:" ));

		
		//processamento
		div = (int)n1 / (int)n2;
		pot = Math.pow(n1, n2);
		
		//saída de resultados
		msg = "n1 = " + n1 + " n2 = " + n2 + "\n";
		msg = msg + "Quociente da divisão de n1 por n2 = " + div + "\n";
		msg = msg + "Potência de n1 por n2 = " + pot + "\n";
		JOptionPane.showMessageDialog(null, msg);
		
		System.exit(0);
	}
}
		
		
		