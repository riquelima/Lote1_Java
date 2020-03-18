/*
 *************************
Lote 01 - Exercício 11 - Estrutura Decisão

11 - Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Estrutura_Seq_Dec_Rep;

import java.util.Scanner;

public class Ex11_EstDec {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double raio, comprimento, pi;
		
		// Entrada de dados
		System.out.println("Digite o raio da circunferÃªncia");
		raio = in.nextDouble();
		
		// Calculando o comprimento
		pi = 3.14;
		comprimento = 2 * pi * raio;
		
		// Exibindo resultado
		System.out.println("O comprimento da circunferÃªncia Ã©:" + comprimento);
		
	}

}
