/*
 *************************
Lote 01 - Exercício 22 - Procedimento

23 - Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. 
Mostre os 4 números em ordem crescente.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Metodos;

import java.util.Scanner;

public class Ex23_Procedimento {
	
	public static void OrdenaNumeros() {
		Scanner in = new Scanner(System.in);
		int valor1, valor2, valor3, valor4;
		
		// Coletando os dados:
		System.out.println(" ---- DIGITE 4 VALORES EM ORDEM CRESCENTE ----- ");
		System.out.println("Digite o primeiro número");
		valor1 = in.nextInt();
		
		System.out.println("Digite o segundo número");
		valor2 = in.nextInt();
		
		System.out.println("Digite o terceiro número");
		valor3 = in.nextInt();
		
		System.out.println("Digite o quarto número");
		valor4 = in.nextInt();
		
		// Validando se os três primeiros números estão em ordem crescente e organizando-os
		if ((valor2<valor1) || (valor3<valor2)) {
			System.out.println("Os valores não estão em ordem crescente. Tente novamente.");			
		}else {
			if(valor4 < valor1) {
				System.out.println("A sequência é: " +valor4+ "," + valor1 + "," + valor2 + "," + valor3 );				
			}else {
				if (valor4 < valor2) {
					System.out.println("A sequência é: " +valor1+ "," + valor4 + "," + valor2 + "," + valor3 );	
				}else {
					if (valor4 < valor3) {
						System.out.println("A sequência é: " +valor1+ "," + valor2 + "," + valor4 + "," + valor3 );	
					}else {
						System.out.println("A sequência é: " +valor1+ "," + valor2 + "," + valor3 + "," + valor4 );	
					}
				}
			}
		}
		
	}

	public static void main(String[] args) {
		OrdenaNumeros();

	}

}
