/*
 *************************
Lote 01 - Exercício 44 - Estrutura Repetição
44 - Receba o número da base e do expoente. Calcule e mostre o valor da potência.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Estrutura_Seq_Dec_Rep;
import java.util.Scanner;


public class Ex44_EstRep {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double base, expoente, potencia;
		
		// Coletando os valores de base e expoente
		System.out.println("Digite o número da base: ");
		base = in.nextInt();
		
		System.out.println("Digite o número do expoente: ");
		expoente = in.nextInt();
		
		// Realizando o cálculo da potência
		
			potencia = Math.pow(base, expoente);
			
			System.out.println( "Resultado " + potencia);
		}	

	}
