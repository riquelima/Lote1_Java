/*
 *************************
Lote 01 - Exercício 15 - Estrutura Decisão

15 - Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Estrutura_Seq_Dec_Rep;

import java.util.Scanner;

public class Ex15_EstDec {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double cateto1, cateto2, hipotenusa;
		
		// Entrada de dados
		System.out.println("Digite o valor do 1Âº cateto:");
		cateto1 = in.nextInt();
		
		System.out.println("Digite o valor do 2Âº cateto:");
		cateto2 = in.nextInt();
		
		// Calculando o valor da hipotenusa
		hipotenusa = (cateto1 * cateto1) + (cateto2 * cateto2);
		resultado = Math.sqrt(hipotenusa);
		
		// Exibindo resultado
		System.out.println("O valor da hipotenusa Ã©: " + Math.sqrt(hipotenusa));		
		
	}

}
