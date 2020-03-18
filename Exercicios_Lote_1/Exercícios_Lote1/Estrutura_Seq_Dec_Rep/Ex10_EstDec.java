/*
 *************************
Lote 01 - Exerc�cio 10 - Estrutura Decis�o

10 - Receba os 2 n�meros inteiros. Calcule e mostre a soma dos quadrados.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Estrutura_Seq_Dec_Rep;

import java.util.Scanner;

public class Ex10_EstDec {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1, num2, diferenca;
		
		// Entrada de dados
		System.out.println("Digite o primeiro número:");
		num1 = in.nextInt();
			
		System.out.println("Digite o segundo número:");
		num2= in.nextInt();
		
		// Calculando a diferença
		diferenca = num1 - num2;
		
		// Exibindo o resultado
		System.out.println("A diferença entre os dois números é:" + diferenca);
		
		
		
		
	}
}
