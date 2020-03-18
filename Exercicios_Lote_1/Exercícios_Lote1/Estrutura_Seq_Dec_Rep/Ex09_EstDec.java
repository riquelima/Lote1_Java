/*
 *************************
Lote 01 - Exercício 9 - Estrutura Decisão

9 - Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Estrutura_Seq_Dec_Rep;

import java.util.Scanner;

public class Ex09_EstDec {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1, num2, soma;
		
		// Entrada de dados
		System.out.println("Digite o primeiro nÃºmero:");
		num1 = in.nextInt();
		
		System.out.println("Digite o segundo nÃºmero:");
		num2= in.nextInt();
		
		// Calculando a soma dos quadrados
		soma = (num1 * num1) + (num2 * num2);
		
		// Exibindo resultado
		System.out.println("A soma dos quadrados Ã©: " + soma);
			
	}

}
