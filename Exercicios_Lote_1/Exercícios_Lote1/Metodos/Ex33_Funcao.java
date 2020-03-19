/*
 *************************
Lote 01 - Exercício 33 - Funcão

33 - Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.

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
		
		System.out.println("Digite um número:");
		num = in.nextInt();
		
		System.out.println("SOMA = " + CalcSerie(num));
		
	 }
	
	public static double CalcSerie(double n) { // Função Recursiva
		double soma;
		if (n == 1) {
            return 1/n;
        } else {
            soma = (1/n) + CalcSerie(n-1);
            return soma;
            }
	
     }
}