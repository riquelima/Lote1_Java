/*
 *************************
Lote 01 - Exerc�cio 24 - Estrutura de Decis�o

24 - Receba um valor inteiro. Verifique e mostre se � divis�vel por 2 e 3.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Estrutura_Seq_Dec_Rep;
import java.util.Scanner;


public class Ex24_EstDec {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int valor;
		
		// Entrada de Dados
		System.out.println("Digite um valor:");
		valor = in.nextInt();
		
		// Verificando se o valor � divis�vel por 2 ou por 3
		if (valor%2 == 0 ) {
			System.out.println("O VALOR � DIVIS�VEL POR 2!");
			}else {
				if (valor%3==0) {
				System.out.println("O VALOR � DIVIS�VEL POR 3!");			
		}else {
			System.out.println("O VALOR N�O � DIVIS�VEL POR 3! NEM POR 2!");	
		}
			
		}

	}

}
