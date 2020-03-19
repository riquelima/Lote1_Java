/*
 *************************
Lote 01 - Exercício 36- Função
Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
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
		
		System.out.println("Digite um número: ");
		num = in.nextFloat();
		
		System.out.println("O fatorial do número é: " + Fatorial(num));
		System.out.println("A soma da série 1 + 1/1! + 1/2! + ... + 1/N: " + SomaSerie(num));
	}

	public static float Fatorial(float n) {		// Função calcula fatorial
		float i, fat=1;
		
		for (i= n; 1 <= i; i--) {
			fat = fat * i;			
		}
		return fat;
	}
	
	public static float SomaSerie(float n) {    // Função Soma
		float soma;
		if (n == 1) {
            return 1/Fatorial(n);
        } else {
            soma = (1/Fatorial(n)) + SomaSerie(Fatorial(n)-1);
            return soma;
            }
	
     }
}


