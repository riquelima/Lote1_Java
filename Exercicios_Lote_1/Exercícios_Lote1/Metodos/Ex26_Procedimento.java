/*
 *************************
Lote 01 - Exercício 26 - Procedimento

26 - Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Metodos;
import java.util.Scanner;


public class Ex26_Procedimento {
	
	public static void MaiorNumero() {
		Scanner in = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Digite o primeiro número:");
		num1 = in.nextInt();
				
		System.out.println("Digite o segundo número");
		num2 = in.nextInt();
		
		if(num1%num2 == 0) {
			System.out.println("O MAIOR NÚMERO É: " +num1);
			System.out.println("O NÚMERO " + num1 + " É MÚLTIPLO DE " + num2);
			}else {
				if(num2%num1 == 0) {
					System.out.println("O MAIOR NÚMERO É: " +num2);
					System.out.println("O NÚMERO " + num2 + " É MÚLTIPLO DE " + num1);

				}
			}
		
	}

	public static void main(String[] args) {
		MaiorNumero();

	}

}
