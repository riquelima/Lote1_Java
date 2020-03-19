package Recursividade;
/*
 *************************
Exerc�cio 3 - Recursividade 
3- Serie3 = (1/1) + (1/2) + (1/3) + ....+ (1/N) 

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

import java.util.Scanner;
public class Ex3_Recursividade {
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double num, i;
		double soma=0;
		
		System.out.println("Digite um n�mero:");  // Coletando o n�mero para iniciar a s�rie
		num = in.nextDouble();
		
		System.out.println("A soma da s�rie �: " + Serie3(num));
		
			
		
	}
	public static double Serie3(double n) {   // S�rie recursiva
		
		if (n==1) {
			return 1;
		}
		else {
			return 1/n + Serie3(n-1); // Calcula e retorna o valor da vari�vel num de entrada
		}
		
	}
}
