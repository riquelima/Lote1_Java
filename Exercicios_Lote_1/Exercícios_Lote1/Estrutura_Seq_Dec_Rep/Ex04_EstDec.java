/*
 *************************
Lote 01 - Exercício 4 - Estrutura Decisão

4 - Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida
em fahrenheit F = (9*C+160) /5.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Estrutura_Seq_Dec_Rep;

import java.util.Scanner;

public class Ex04_EstDec {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double C, F;
		
		// Entrada de dados
		System.out.println("Digite a temperatura em Celsius:");
		C = in.nextDouble();
		
		
		// Convertendo para Farehreint
		F = (9*C+160)/5;
		
		// Mostrando o resultado
		System.out.println("A temperatura em Farehreint Ã©:" + F);
			
	}
}
