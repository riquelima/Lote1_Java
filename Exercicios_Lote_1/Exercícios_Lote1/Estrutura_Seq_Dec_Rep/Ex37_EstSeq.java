/*
 *************************
Lote 01 - Exercício 37 - Estrutura Repetição
37 - Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Estrutura_Seq_Dec_Rep;

import java.util.Scanner;

public class Ex37_EstSeq {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int numero, ant1 = 1, ant2 = 1, prox, i;

		System.out.println("Digite um número para calcular a série de Fibonacci:");
		numero = in.nextInt();

		for (i = 0; i <= numero; i++) {
			if ((i == 0) || (i == 1)) {
				System.out.println("A sequência é " + i);
			} else {
				prox = ant1 + ant2;
				System.out.println("A sequência é " + prox);
				ant2 = ant1;
				ant1 = prox;
			}

		}

	}
}
