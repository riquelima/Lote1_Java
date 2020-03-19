/*
 *************************
Lote 01 - Exercício 19 - Estrutura Decisão

19 - Receba 2 valores reais. Calcule e mostre o maior deles.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Estrutura_Seq_Dec_Rep;
import java.util.Scanner;

public class Ex19_EstDec {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double valor1, valor2;
		
		// Entrada de dados
		System.out.println("Digite o primeiro valor");
		valor1 = in.nextDouble();
		
		System.out.println("Digite o segundo valor");
		valor2 = in.nextDouble();
		
		// Descobrindo qual é o maior valor
		if (valor1 > valor2) {
			System.out.println("O maior valor é:"+valor1);
			
		}else {
			System.out.println("O maior valor é:"+valor2);
			
		}
	}

}
