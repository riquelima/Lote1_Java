/*
 *************************
Lote 01 - Exerc�cio 20 - Estrutura Decis�o

20 - Receba 3 coeficientes A, B, e C de uma equa��o do 2� grau da f�rmula AX�+BX+C=0.
 Verifique e mostre a exist�ncia de ra�zes reais e se caso exista, calcule e mostre.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Estrutura_Seq_Dec_Rep;
import java.util.Scanner;

public class Ex20_EstDec {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b, c;
		double delta, x1, x2;
		
		// Entrada de dados
		System.out.println("Digite um valor para A");
		a = in.nextInt();
		
		System.out.println("Digite um valor para B");
		b = in.nextInt();
		
		System.out.println("Digite um valor para C");
		c = in.nextInt();
		
		// Descobrindo o valor de DELTA, X1 e X2
		delta = ((b*b) - 4*a*c);
		x1 = (-(b)- Math.sqrt(delta))/2*a;
		x2 = (-(b)+ Math.sqrt(delta))/2*a;
		
		// Descobrindo a exist�ncia de ra�zes reais
		if (delta < 0) {
			System.out.println("Delta < 0. N�o existem ra�zes reais");
		}else {
			if(delta == 0) {
				x1 = (-(b)- Math.sqrt(delta))/2*a;
				System.out.println("Delta = 0. Ra�zes reais iguais:"+ x1);
			}else {
				if(delta > 0) {
					x1 = (-(b)- Math.sqrt(delta))/2*a;
					x2 = (-(b)+ Math.sqrt(delta))/2*a;
					System.out.println("Delta > 0. Ra�zes reais iguais:");
					System.out.println("X1 = "+x1);
					System.out.println("X2 = "+x2);

					
					
				}
			}
		}
		
				
	}

}
