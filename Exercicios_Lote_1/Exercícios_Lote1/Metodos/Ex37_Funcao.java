/*
 *************************
Lote 01 - Exerc�cio 37 - Fun��o
37 - Receba um n�mero inteiro. Calcule e mostre a s�rie de Fibonacci at� o seu N�n�simo termo.
Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Metodos;

import java.util.Scanner;

public class Ex37_Funcao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;

		System.out.println("Digite um n�mero: ");
		num = in.nextInt();

		System.out.println(" A s�rie �: " + FSerie(num));

	}

	public static int FSerie(int n) {
		int i, ant1=1, ant2=1, prox=0;
		 if (n < 2) {
			 return n;
		 }else {
			 return FSerie (n-1) + (n-2);

		 }
	}
}
