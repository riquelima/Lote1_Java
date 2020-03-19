package Recursividade;
/*
 *************************
Exercício 2 - Recursividade 
2- Serie1 = Serie2 = (N) + (N-1) + (N-2) + ... + (1) 

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

import java.util.Scanner;

public class Ex2_Recursividade {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num; 
		
		System.out.println("Digite um número:");
		num = in.nextInt();
		
		System.out.println("A soma é: " + Serie2(num));
		

	}
	public static int Serie2(int n) {
		if(n==1) {
			return n;
		}else {
			return n + Serie2(n-1);
		}
		
	}

}
