//salvar como Prog06.java
import javax.swing.*;

class Atv16
{	
	public static void soma (int vet[])
	{
		int s=0;
		for (int i = 0; i<vet.length; i++)
		{
			s = s + vet[i];
		}
		JOptionPane.showMessageDialog(null, "A somatória é " + s);
	}
	
	public static int produto(int vet[])
	{
		int p=1;
		for (int i = 0; i<vet.length; i++)
		{
			p = p * vet[i];
		}
		return p;
	}
	
	
	public static void main (String entrada [])
	{
		
		int s=0;
		int r;
		int vetor[] = new int [5];
		String msg = "O vetor é: ";
		
		for (int i = 0; i < vetor.length; i++)
		{
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro para posição " + i));
			msg = msg + vetor[i] + " ";
		}
		JOptionPane.showMessageDialog(null, msg);
		
		soma(vetor);
		r = produto(vetor);
		JOptionPane.showMessageDialog(null, "A produtória é " + r);
		
		System.exit(0);
	}
}
		
		
		