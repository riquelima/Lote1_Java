/*
 *************************
Lote 01 - Exerc�cio 40  Estrutura Repeti��o
40 - Receba 2 n�meros inteiros. Verifique e mostre todos os n�meros primos existentes entre eles.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */


package Estrutura_Seq_Dec_Rep;
import java.util.Scanner;

public class Ex40_EstRep {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num1, num2, i, c,  primo=0;
		double divisores = 0;
		
		// Entrada de Dados
		System.out.println("Digite o primeiro n�mero: ");
		num1 = in.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		num2 = in.nextInt();
		
		// Coletando n�meros primos
		for(c = num1; c <= num2; c++){
			primo = 0;
			for ( i = 1; i <= c; i++) {
				if(c % i == 0) {
					primo = primo + 1;
					}					
				}
				if (primo == 2) { // Se a quantidade de opera��es com mod 0 for igual a 2, � porque � um n�mero primo
					System.out.println(c + " ... ");
			}
			
		}

		
		
	
		
		

	}

}
