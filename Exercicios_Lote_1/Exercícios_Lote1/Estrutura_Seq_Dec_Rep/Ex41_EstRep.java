/*
 *************************
Lote 01 - Exercício 41 - Estrutura Repetição
41 - Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Estrutura_Seq_Dec_Rep;
import java.util.Scanner;

public class Ex41_EstRep {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, c;
		
		// Coletando a combinação dos lados dos dados:
		for (c = 1; c <=6; c++) {
			for (i = 1; i<=6; i++) {
				System.out.println("Dado 1: " + c);
				System.out.println("Dado 2: " + i);
				System.out.println("------------------");
				
				if (c + i == 7) {
					System.out.println("Combinação que resulta em soma 7: " + c + " x " + i);
					System.out.println("------------------");
					
				}
				
			}
		}

	}

}