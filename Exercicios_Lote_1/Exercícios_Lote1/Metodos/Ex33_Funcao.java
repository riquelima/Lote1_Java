/*
 *************************
Lote 01 - Exerc�cio 33 - Func�o

33 - Receba um n�mero. Calcule e mostre a s�rie 1 + 1/2 + 1/3 + ... + 1/N.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Metodos;
import java.util.Scanner;


public class Ex33_Funcao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float num, i=1, f=1;
		float soma=0, resultado=0;
		
		System.out.println("Digite um n�mero:");
		num = in.nextInt();
		
		System.out.println("SOMA = " + CalcSerie(num));
		
	 }
	
	public static double CalcSerie(double n) { // Fun��o Recursiva
		double soma;
		if (n == 1) {
            return 1/n;
        } else {
            soma = (1/n) + CalcSerie(n-1);
            return soma;
            }
	
     }
}