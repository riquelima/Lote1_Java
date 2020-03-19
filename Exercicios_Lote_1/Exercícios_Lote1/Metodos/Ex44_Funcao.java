/*
 *************************
Lote 01 - Exerc�cio 44   Fun��o
44 - Receba o n�mero da base e do expoente. Calcule e mostre o valor da pot�ncia.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Metodos;

import java.util.Scanner;

public class Ex44_Funcao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double base, expoente;
		
		System.out.println("Digite o n�mero da base: ");
		base = in.nextInt();
		
		System.out.println("Digite o n�mero do expoente: ");
		expoente = in.nextInt();
		
		System.out.println(" O resultado da potencia de " +base + " ^ " + expoente + " = " +CalculaPotencia(base,expoente));
	}
	
	public static double CalculaPotencia(double x, double y) {
		double potencia;
		
		potencia = Math.pow(x, y);
		return potencia;
	
	}

}
