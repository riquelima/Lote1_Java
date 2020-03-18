/*
 *************************
Lote 01 - Exerc�cio 3 - Estrutura Decis�o

3 - Receba a base e a altura de um tri�ngulo. Calcule e mostre a sua �rea.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Estrutura_Seq_Dec_Rep;

import java.util.Scanner;

public class Ex03_EstDec {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int base, altura, area;
		
		// Lendo entrada de dados
		System.out.println("Digite a base do triângulo:");
		base = in.nextInt();
		
		System.out.println("Digite a altura do triângulo:");
		altura = in.nextInt();
		
		// Calculando a area
		area = (base * altura)/2;
		
		// Mostrando o resultado
		System.out.println("A área do triângulo é:" + area);	

	}

}
