/*
 *************************
Lote 01 - Exercício 40  Função
40 - Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Metodos;

import java.util.Scanner;

public class Ex40_Funcao {

	public static void main(String[] args) {
		
		BuscaPrimos();

	}

	public static void BuscaPrimos() {  // Procedimento Busca Primos entre num1 e num2;
		Scanner in = new Scanner(System.in);
		double num1, num2, c, i, primo = 0;
		
		System.out.println("Digite o primeiro número: ");
		num1 = in.nextDouble();

		System.out.println("Digite o segundo número: ");
		num2 = in.nextDouble();
		
		
		for(c = num1; c <= num2; c++){
			primo = 0;
			for ( i = 1; i <= c; i++) {
				if(c % i == 0) {
					primo = primo + 1;
					}					
				}
				if (primo == 2) { // Se a quantidade de operações com mod 0 for igual a 2, é porque é um número primo
					System.out.println(c + " ... ");
			}
			
		}
		}
		

	}

