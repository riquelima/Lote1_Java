/*
 *************************
Lote 01 - Exerc�cio 36- Fun��o
Receba um n�mero N. Calcule e mostre a s�rie 1 + 1/1! + 1/2! + ... + 1/N!
Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Metodos;
import java.util.Scanner;


public class Ex36_Funcao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float num;
		
		System.out.println("Digite um n�mero: ");
		num = in.nextFloat();
		
		System.out.println("O fatorial do n�mero �: " + Fatorial(num));
		System.out.println("A soma da s�rie 1 + 1/1! + 1/2! + ... + 1/N: " + SomaSerie(num));
	}

	public static float Fatorial(float n) {		// Fun��o calcula fatorial
		float i, fat=1;
		
		for (i= n; 1 <= i; i--) {
			fat = fat * i;			
		}
		return fat;
	}
	
	public static float SomaSerie(float n) {    // Fun��o Soma
		float soma;
		if (n == 1) {
            return 1/Fatorial(n);
        } else {
            soma = (1/Fatorial(n)) + SomaSerie(Fatorial(n)-1);
            return soma;
            }
	
     }
}


