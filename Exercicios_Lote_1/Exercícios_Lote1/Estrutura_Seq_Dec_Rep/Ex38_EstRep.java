/*
 *************************
Lote 01 - Exercício 38 - Estrutura Repetição
38 - Receba 100 números inteiros reais. Verifique e mostre o maior e o menos valor. 
Obs.: somente valores positivos.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Estrutura_Seq_Dec_Rep;
import java.util.Scanner;

public class Ex38_EstRep {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double numero=0, maior = 0, menor = 0;
		int i;
		
		// Entrada de dados
		for (i = 1; i <= 5; i++) {
			System.out.println("Digite um número: ");
			numero = in.nextDouble();
			
			if( i == 1) {
				maior = numero;
				menor = numero;				
			} else if (numero > maior) {
				maior = numero;			
				
			} else if (numero < menor) {
				menor = numero;
			}						
		}
		System.out.println("O maior valor digitado foi: " + maior);
		System.out.println("O menor valor digitado foi: " + menor);
		
		

	}

}
