/*
 *************************
Lote 01 - Exercício 22 - Estrutura Decisão

22 - Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Estrutura_Seq_Dec_Rep;

import java.util.Scanner;

public class Ex22_EstDec {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int valor1, valor2;
		
		// Coletando dados:
		System.out.println("Digite o primeiro valor:");
		valor1 = in.nextInt();
		
		System.out.println("Digite o segundo valor:");
		valor2 = in.nextInt();
		
		// Descobrindo se os valores são diferentes e exibindo em ordem crescente
		if(valor1 == valor2) {
			System.out.println("Os valores são iguais. Digite valores diferentes");			
		}else {
			if(valor1 < valor2) {
				System.out.println("A sequência é:" + valor1 + " e " + valor2);
			}else {
				if(valor2 < valor1) {
					System.out.println("A sequência é:"+valor2 + " e " +valor1);
					
					
				}
			}
		}

	}

}
