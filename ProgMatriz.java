//salvar como Prog06.java
import javax.swing.*;

class ProgMatriz
{	
	public static void main (String entrada[])
	{
		//declaração de variáveis
		int vetor[] = new int [5];
		int matriz[][] = new  int [2] [3];
		String msg = "vetor = ";
		
		//vetor =; 
		for (int i = 0; i < vetor.length; i++)
		{
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um inteiro para posição " + i));
			msg = msg + vetor[i] + " ";
		}
		JOptionPane.showMessageDialog(null, msg);

		
		msg = "Matriz = \n\n";
		for (int i = 0; i < matriz.length; i++)
		{
			for (int j = 0; j < matriz[0].length; j++)
			{ 
					matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um inteiro para posição " + i + " e " + j));
					msg = msg + matriz[i][j] + " ";
			}
			msg = msg + "\n";
					
				
		}	
		
		//saída de resultados
		JOptionPane.showMessageDialog(null, msg);
		
		System.exit(0);
	}
}
		
		
		