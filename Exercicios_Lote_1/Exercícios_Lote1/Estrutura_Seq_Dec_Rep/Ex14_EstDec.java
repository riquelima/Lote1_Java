/*
 *************************
Lote 01 - Exercício 14 - Estrutura Decisão

14 - Receba 2ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Estrutura_Seq_Dec_Rep;

import java.util.Scanner;

public class Ex14_EstDec {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int angulo1, angulo2, angulo3;
		
		// Entrada de dados
		System.out.println("Digite o valor do primeiro Ã¢ngulo");
		angulo1 = in.nextInt();
		
		System.out.println("Digite o valor do segundo Ã¢ngulo");
		angulo2 = in.nextInt();
		
		// Calculando o valor do terceiro Ã¢ngulo
		angulo3 = 180 - (angulo1 + angulo2);
		
		// Exibindo resultado
		System.out.println("O terceiro Ã¢ngulo Ã© de " + angulo3 + " graus");
		
		
	}

}
