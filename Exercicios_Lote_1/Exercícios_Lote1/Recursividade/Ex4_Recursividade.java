package Recursividade;
/*
 *************************
Exercício 4 - Recursividade 
4 - Serie4 = (N/1) +(N-1 / 2 ) + (N-2 / 3) + .... + (1/N)  

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

import java.util.Scanner;
public class Ex4_Recursividade {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double num, j=1;
		
		System.out.println("Digite um número para calcular a série:");
		num = in.nextDouble();
		
		Serie4(num,j);
		
		System.out.println("A soma da série é :" + Serie4(num,j));
	
	}
	public static double Serie4(double n, double j) {
		if (n == 1) {
			return 1;
		}else {
			return n/j + Serie4(n - 1,j + 1);
	}

}
}
