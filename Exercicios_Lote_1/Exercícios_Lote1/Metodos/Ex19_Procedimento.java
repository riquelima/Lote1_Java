/*
 *************************
Lote 01 - Exercício 19 - Procedimento

19 - Receba 2 valores reais. Calcule e mostre o maior deles.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Metodos;
import java.util.Scanner;

public class Ex19_Procedimento {
	
	public static void MaiorValor(){
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
	
	public static void main(String[] args) {
		MaiorValor();
		

	}

}
