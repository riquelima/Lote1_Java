/*
 *************************
Lote 01 - Exerc�cio 15 - Estrutura Decis�o

15 - Receba os valores de 2 catetos de um tri�ngulo ret�ngulo. Calcule e mostre a hipotenusa.

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
		System.out.println("Digite o valor do 1º cateto:");
		cateto1 = in.nextInt();
		
		System.out.println("Digite o valor do 2º cateto:");
		cateto2 = in.nextInt();
		
		// Calculando o valor da hipotenusa
		hipotenusa = (cateto1 * cateto1) + (cateto2 * cateto2);
		resultado = Math.sqrt(hipotenusa);
		
		// Exibindo resultado
		System.out.println("O valor da hipotenusa é: " + Math.sqrt(hipotenusa));		
		
	}

}
