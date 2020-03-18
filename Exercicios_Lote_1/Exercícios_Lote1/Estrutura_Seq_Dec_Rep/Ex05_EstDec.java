/*
 *************************
Lote 01 - Exercício 5 - Estrutura Decisão

5 - Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0).
 Calcule e mostre as raízes reais (considerar que a equação possue 2 raízes).

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Estrutura_Seq_Dec_Rep;

import java.util.Scanner;

public class Ex05_EstDec {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b, c;
		double delta, x1, x2;
		
		// Entrada de dados
		System.out.println("Digite um valor para A");
		a = in.nextInt();
		
		System.out.println("Digite um valor para B");
		b = in.nextInt();
		
		System.out.println("Digite um valor para C");
		c = in.nextInt();
		
		// Descobrindo o valor de DELTA, X1 e X2
		delta = ((b*b) - 4*a*c);
		x1 = (-(b)- Math.sqrt(delta))/2*a;
		x2 = (-(b)+ Math.sqrt(delta))/2*a;
		
		// Exibindo resultado
		System.out.println("O valor de delta Ã©: " + delta);
		System.out.println("O valor de x1: " + x1);
		System.out.println("O valor de x2 Ã©: " + x2);
				
	}

}
