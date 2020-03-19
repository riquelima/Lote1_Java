/*
 *************************
Lote 01 - Exercício 24 - Procedimento

24 - Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Metodos;
import java.util.Scanner;

public class Ex24_Procedimento {
	
	public static void Divisiveis() {
		Scanner in = new Scanner(System.in);
        int valor;
		
		// Entrada de Dados
		System.out.println("Digite um valor:");
		valor = in.nextInt();
		
		// Verificando se o valor é divisível por 2 ou por 3
		if (valor%2 == 0 ) {
			System.out.println("O VALOR É DIVISÍVEL POR 2!");
			}else {
				if (valor%3==0) {
				System.out.println("O VALOR É DIVISÍVEL POR 3!");			
		}else {
			System.out.println("O VALOR NÃO É DIVISÍVEL POR 3! NEM POR 2!");	
		}
			
		}
	}

	public static void main(String[] args) {
		Divisiveis();

	}

}
