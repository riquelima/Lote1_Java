/*
 +++++++++++++++++++++++++++++++++++
 
Lote 01 - Exerc�cio 34 - Fun��o

34 - Receba um n�mero. Calcule e mostre os resultados da tabuada desse n�mero.
Programador: Henrique Souza Lima
Professor: Ricardo Satoshi

 +++++++++++++++++++++++++++++++++++++
 */

package Metodos;
import java.util.Scanner;

public class Ex34_Funcao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num, i;
		
		System.out.println("Digite um n�mero: ");
		num = in.nextInt();
		
		System.out.println(CalcTabuada(num));
	}

		
	public static int CalcTabuada(int n) {
		int i, resultado=0;
		for (i = 1; i <= 10; i++) {
			resultado = n * i;
			System.out.println(n + " x " + i + " = " + resultado);
            }
		return resultado;
	}
}
