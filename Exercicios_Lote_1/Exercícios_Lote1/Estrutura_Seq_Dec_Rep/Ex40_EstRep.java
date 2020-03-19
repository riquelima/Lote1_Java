/*
 *************************
Lote 01 - Exercício 40  Estrutura Repetição
40 - Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.

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
		System.out.println("Digite o primeiro número: ");
		num1 = in.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = in.nextInt();
		
		// Coletando números primos
		for(c = num1; c <= num2; c++){
			primo = 0;
			for ( i = 1; i <= c; i++) {
				if(c % i == 0) {
					primo = primo + 1;
					}					
				}
				if (primo == 2) { // Se a quantidade de operações com mod 0 for igual a 2, é porque é um número primo
					System.out.println(c + " ... ");
			}
			
		}

		
		
	
		
		

	}

}
