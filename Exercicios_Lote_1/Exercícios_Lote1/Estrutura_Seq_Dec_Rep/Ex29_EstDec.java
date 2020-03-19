/*
 *************************
Lote 01 - Exerc�cio 29 - Estrutura Decis�o

29 - Receba o tipo de investimento (1 = poupan�a e 2 = renda fixa) e o valor do investimento. 
Calcule e mostre o valor corrigido em 30 dias sabendo que a poupan�a = 3% e a renda fixa = 5%. 
Demais tipos n�o ser�o considerados.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Estrutura_Seq_Dec_Rep;
import java.util.Scanner;

public class Ex29_EstDec {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tipo, poupanca, renda_fixa;
		double valor;
	System.out.println(" ----- TABELA DE RENDIMENTO --------");	
	System.out.println("POUPANCA = 3% AO M�S");
	System.out.println("RENDA FIXA = 5% AO M�S");
	
	System.out.println("Digite 1 para poupan�a ou 2 para renda fixa:");
	tipo = in.nextInt();
	
		switch(tipo){
			case 1: 
				System.out.println("Digite o valor a ser investido:");
				valor = in.nextDouble();
				valor = ((valor * 3)/100) + valor;		
				System.out.println("Saldo ap�s 30 dias: " + valor); break;
			case 2: 
				System.out.println("Digite o valor a ser investido:");
				valor = in.nextDouble();
				valor = ((valor * 5)/100) + valor;	
				System.out.println("Saldo ap�s 30 dias: " + valor); break;
			default: System.out.println("OP��O INV�LIDA"); break;
		}
		
		
		
		
	}
}

