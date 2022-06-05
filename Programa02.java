//salvar como Programa02.java

class Programa02
{	
	public static void main (String entrada[])
	{
		//declaração de variáveis
		int n1, n2;
		int mod, div;
		double raiz, pot;
		String msg = "";
		
		//entrada de dados
		n1 = Integer.parseInt(entrada[0]);
		n2 = Integer.parseInt(entrada[1]);
;
		
		//processamento
		mod = n1 % n2;
		div = (int)n1 / (int)n2;
		raiz = Math.sqrt(n1);
		pot = Math.pow(n1, n2);
		
		//saída de resultados
		msg = "n1 = " + n1 + " n2 = " + n2 + "\n";
		msg = msg + "Resto da divisão de n1 por n2 = " + mod + "\n";
		msg = msg + "Quociente da divisão de n1 por n2 = " + mod + "\n";
		msg = msg + "Raiz quadrada de n1 = " + raiz + "\n";
		msg = msg + "Potência de n1 e n2 = " + pot + "\n";
		System.out.println(msg);
		
		System.exit(0);
	}
}
		
		
		