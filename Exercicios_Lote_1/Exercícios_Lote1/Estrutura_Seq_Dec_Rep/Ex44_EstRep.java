/*
 *************************
Lote 01 - Exerc�cio 44 - Estrutura Repeti��o
44 - Receba o n�mero da base e do expoente. Calcule e mostre o valor da pot�ncia.

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
		System.out.println("Digite o n�mero da base: ");
		base = in.nextInt();
		
		System.out.println("Digite o n�mero do expoente: ");
		expoente = in.nextInt();
		
		// Realizando o c�lculo da pot�ncia
		
			potencia = Math.pow(base, expoente);
			
			System.out.println( "Resultado " + potencia);
		}	

	}
