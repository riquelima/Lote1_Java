/*
 *************************
Lote 01 - Exerc�cio 22 - Procedimento

22 - Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Metodos;
import java.util.Scanner;


import java.util.Scanner;

public class Ex22_Procedimento {
	
	public static void Organiza() {
Scanner in = new Scanner(System.in);
		
		int valor1, valor2;
		
		// Coletando dados:
		System.out.println("Digite o primeiro valor:");
		valor1 = in.nextInt();
		
		System.out.println("Digite o segundo valor:");
		valor2 = in.nextInt();
		
		// Descobrindo se os valores s�o diferentes e exibindo em ordem crescente
		if(valor1 == valor2) {
			System.out.println("Os valores s�o iguais. Digite valores diferentes");			
		}else {
			if(valor1 < valor2) {
				System.out.println("A sequ�ncia �:" + valor1 + " e " + valor2);
			}else {
				if(valor2 < valor1) {
					System.out.println("A sequ�ncia �:"+valor2 + " e " +valor1);
					
					
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
