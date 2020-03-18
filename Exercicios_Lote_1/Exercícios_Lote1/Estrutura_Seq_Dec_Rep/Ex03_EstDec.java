/*
 *************************
Lote 01 - ExercÌcio 3 - Estrutura Decis„o

3 - Receba a base e a altura de um tri‚ngulo. Calcule e mostre a sua ·rea.

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
		System.out.println("Digite a base do tri√¢ngulo:");
		base = in.nextInt();
		
		System.out.println("Digite a altura do tri√¢ngulo:");
		altura = in.nextInt();
		
		// Calculando a area
		area = (base * altura)/2;
		
		// Mostrando o resultado
		System.out.println("A √°rea do tri√¢ngulo √©:" + area);	

	}

}
