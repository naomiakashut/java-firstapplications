//salvar como ProgRepeticao.java
import javax.swing.*;

class ProgRepeticao
{	
	public static void main (String entrada[])
	{
		//declaração de variáveis
		int num;
		char op=0;
		String msg = "", msgEntr = "Digite 1 para par/ímpar;\nDigite 2 para positivo/negativo:";
		
		//entrada de dados
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: " ));
		op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);

		
		//processamento
		switch(op)
		{
			case'1':
			{ 
				if (num % 2 == 0)
					{
						msg = msg + num + " é par. \n";
					}
				
				else
					{
						msg = msg + num + " é ímpar.\n";
					}
					break;
			}
			
			case '2':
			{
				if (num > 0)
					{
						msg = msg + num + " é positivo. \n";
					}
				else
					{
						msg = msg + num + " não é positivo. \n";
					}
					break;
			}
			default: JOptionPane.showMessageDialog(null, "Opção inválida, cálculos não realizados.");
					
				
		}	
		
		//saída de resultados
		if (op == '1' || op == '2')
			{
				JOptionPane.showMessageDialog(null, msg);
			}
		
		System.exit(0);
	}
}
		
		
		