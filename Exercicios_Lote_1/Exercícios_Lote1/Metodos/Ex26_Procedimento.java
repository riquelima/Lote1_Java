/*
 *************************
Lote 01 - Exerc�cio 26 - Procedimento

26 - Receba 2 n�meros inteiros. Verifique e mostre se o maior n�mero � m�ltiplo do menor.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Metodos;
import java.util.Scanner;


public class Ex26_Procedimento {
	
	public static void MaiorNumero() {
		Scanner in = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Digite o primeiro n�mero:");
		num1 = in.nextInt();
				
		System.out.println("Digite o segundo n�mero");
		num2 = in.nextInt();
		
		if(num1%num2 == 0) {
			System.out.println("O MAIOR N�MERO �: " +num1);
			System.out.println("O N�MERO " + num1 + " � M�LTIPLO DE " + num2);
			}else {
				if(num2%num1 == 0) {
					System.out.println("O MAIOR N�MERO �: " +num2);
					System.out.println("O N�MERO " + num2 + " � M�LTIPLO DE " + num1);

				}
			}
		
	}

	public static void main(String[] args) {
		MaiorNumero();

	}

}
