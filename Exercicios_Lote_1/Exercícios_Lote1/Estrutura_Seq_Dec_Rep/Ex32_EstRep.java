/*
 *************************
Lote 01 - Exerc�cio 32 - Estrutura Repeti��o

32 - Receba um n�mero inteiro. Calcule e mostre o seu fatorial.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Estrutura_Seq_Dec_Rep;

import java.util.Scanner;


public class Ex32_EstRep {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n, j, fat=1, resultado;
		
		
		System.out.println("Digite um n�mero:");
		n = in.nextInt();
		
		for(j=1; j <= n; j++) {
			if (n==1) {
				System.out.println("O fatorial �:" + n);				
			} else {
				fat =  fat * j;
			}
		}
		System.out.println("O fatorial de " + n + " �: " + fat);
		
	}	

}

