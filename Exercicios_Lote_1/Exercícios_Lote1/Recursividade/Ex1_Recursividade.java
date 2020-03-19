package Recursividade;
/*
 *************************
Exercício 1 - Recursividade 
1- Serie1 = (1+2+3+...+100)

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

import java.util.Scanner;
public class Ex1_Recursividade {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = 1;
		System.out.println("A soma dos valores é " + Soma(num));
		
	}
	
	public static int Soma(int n) {  // Recursividade soma
		int soma;
		
		if(n == 100) {
			return n;
		}else {
			return n + Soma(n+1);
		}
		
	}
}
