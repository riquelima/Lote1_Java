/*
 *************************
Lote 01 - Exerc�cio 22 - Procedimento

23 - Receba 3 valores obrigatoriamente em ordem crescente e um 4� valor n�o necessariamente em ordem. 
Mostre os 4 n�meros em ordem crescente.

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
		System.out.println("Digite o primeiro n�mero");
		valor1 = in.nextInt();
		
		System.out.println("Digite o segundo n�mero");
		valor2 = in.nextInt();
		
		System.out.println("Digite o terceiro n�mero");
		valor3 = in.nextInt();
		
		System.out.println("Digite o quarto n�mero");
		valor4 = in.nextInt();
		
		// Validando se os tr�s primeiros n�meros est�o em ordem crescente e organizando-os
		if ((valor2<valor1) || (valor3<valor2)) {
			System.out.println("Os valores n�o est�o em ordem crescente. Tente novamente.");			
		}else {
			if(valor4 < valor1) {
				System.out.println("A sequ�ncia �: " +valor4+ "," + valor1 + "," + valor2 + "," + valor3 );				
			}else {
				if (valor4 < valor2) {
					System.out.println("A sequ�ncia �: " +valor1+ "," + valor4 + "," + valor2 + "," + valor3 );	
				}else {
					if (valor4 < valor3) {
						System.out.println("A sequ�ncia �: " +valor1+ "," + valor2 + "," + valor4 + "," + valor3 );	
					}else {
						System.out.println("A sequ�ncia �: " +valor1+ "," + valor2 + "," + valor3 + "," + valor4 );	
					}
				}
			}
		}
		
	}

	public static void main(String[] args) {
		OrdenaNumeros();

	}

}
