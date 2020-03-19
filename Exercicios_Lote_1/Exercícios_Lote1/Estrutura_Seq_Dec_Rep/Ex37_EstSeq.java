/*
 *************************
Lote 01 - Exerc�cio 37 - Estrutura Repeti��o
37 - Receba um n�mero inteiro. Calcule e mostre a s�rie de Fibonacci at� o seu N�n�simo termo.
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

		System.out.println("Digite um n�mero para calcular a s�rie de Fibonacci:");
		numero = in.nextInt();

		for (i = 0; i <= numero; i++) {
			if ((i == 0) || (i == 1)) {
				System.out.println("A sequ�ncia � " + i);
			} else {
				prox = ant1 + ant2;
				System.out.println("A sequ�ncia � " + prox);
				ant2 = ant1;
				ant1 = prox;
			}

		}

	}
}
