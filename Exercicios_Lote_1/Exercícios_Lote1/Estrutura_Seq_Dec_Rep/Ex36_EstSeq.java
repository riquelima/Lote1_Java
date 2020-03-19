/*
 *************************
Lote 01 - Exercício 36 - Estrutura de Repetição
Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Estrutura_Seq_Dec_Rep;
import java.util.Scanner;


public class Ex36_EstSeq {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numero, i;
		int fatorial = 1;
		int soma = 0;
		int resultado = 0;
		
				
		System.out.println("Insira um número:");
		numero = in.nextInt();		
		
		// Calculando fatorial:
		for(i = numero; 1 <= i; i--) {
			fatorial = fatorial * i;
			soma = 1/fatorial;
			}
		resultado = 1 + soma;
		System.out.println("O fatorial do número é " + fatorial );
		System.out.println("A soma é " + resultado );
		
		
		
		
		
		
			
		}

}
