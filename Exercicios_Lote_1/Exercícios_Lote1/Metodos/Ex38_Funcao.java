/*
 *************************
Lote 01 - Exerc�cio 38 - Fun��o
38 - Receba 100 n�meros inteiros reais. Verifique e mostre o maior e o menos valor. 
Obs.: somente valores positivos.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Metodos;

import java.util.Scanner;

public class Ex38_Funcao {

	public static void main(String[] args) {

		int valor = 0;

		VerificaMaior(valor);
		
		System.out.println("O maior valor � " + VerificaMaior(valor));
		System.out.println("O maior valor � " + VerificaMenor(valor));
		System.out.println("---------------");

	}

	public static int VerificaMaior(int n) {
		Scanner in = new Scanner(System.in);

		int i, maior = 0, menor = 0;

	
		for (i = 1; i <= 3; i++) {
			System.out.println("Digite um n�mero: ");
			n = in.nextInt();
			
			if( i == 1) {
				maior = n;
				menor = n;				
			} else if (n > maior) {
				maior = n;			
				
			} else if (n < menor) {
				menor = n;
			}						
		}
	}

	public static int VerificaMenor(int n) {

		Scanner in = new Scanner(System.in);

		int i, maior = 0, menor = 0;

		for (i = 1; i <= 3; i++) {
			System.out.println("Insira um valor: ");
			n = in.nextInt();
			if (i == 1) {
				maior = n;
				menor = n;
			} else if (n < menor) {
				menor = n;
				return menor;
			}
		}
		return menor;

	}
}
