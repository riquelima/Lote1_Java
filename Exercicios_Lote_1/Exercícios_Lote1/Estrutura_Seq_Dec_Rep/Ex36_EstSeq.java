/*
 *************************
Lote 01 - Exerc�cio 36 - Estrutura de Repeti��o
Receba um n�mero N. Calcule e mostre a s�rie 1 + 1/1! + 1/2! + ... + 1/N!
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
		
				
		System.out.println("Insira um n�mero:");
		numero = in.nextInt();		
		
		// Calculando fatorial:
		for(i = numero; 1 <= i; i--) {
			fatorial = fatorial * i;
			soma = 1/fatorial;
			}
		resultado = 1 + soma;
		System.out.println("O fatorial do n�mero � " + fatorial );
		System.out.println("A soma � " + resultado );
		
		
		
		
		
		
			
		}

}
