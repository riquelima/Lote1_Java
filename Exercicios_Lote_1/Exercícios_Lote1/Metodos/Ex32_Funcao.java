/*
 *************************
Lote 01 - Exerc�cio 32 - Funcao

32 - Receba um n�mero inteiro. Calcule e mostre o seu fatorial.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Metodos;
import java.util.Scanner;


public class Ex32_Funcao {
	
	public static int Fatorial( int x) {  // Fun��o Calcula Fatorial
		int j, fat=1;
		for(j=1; j <= x; j ++) {
			fat = fat * j;
				}
		return fat;
			
		}
		

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		
		System.out.println("Digite um n�mero para calcular o fatorial:");
		n= in.nextInt();		
		Fatorial(n);
		
		System.out.println("O fatorial de " + n + " � = " + Fatorial(n));

	}

}
