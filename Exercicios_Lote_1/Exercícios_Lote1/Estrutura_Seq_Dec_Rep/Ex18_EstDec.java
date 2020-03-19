/*
 *************************
Lote 01 - Exercício 18 - Estrutura Decisão

18 - Receba 2 valores inteiros. Calcule e mostre o resultado da diferença
 do maior pelo menos valor.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Estrutura_Seq_Dec_Rep;
import java.util.Scanner;

public class Ex18_EstDec {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int valor1, valor2;
		double resultado;
		
		// Entrada de dados
		System.out.println("Digite o primeiro valor");
		valor1 = in.nextInt();
		
		System.out.println("Digite o segundo valor");
		valor2 = in.nextInt();
		
		// Calculando a diferença do maior pelo menor
		if (valor1 > valor2) {
			resultado = (valor1 / valor2);
			System.out.println("O primeiro valor é maior, o resultado da divisão é:" +resultado);
			
		}else {
			resultado = (valor2/valor1);
			System.out.println("O segundo valor é maior, o resultado da divisão é:" +resultado);

		}

	}

}
