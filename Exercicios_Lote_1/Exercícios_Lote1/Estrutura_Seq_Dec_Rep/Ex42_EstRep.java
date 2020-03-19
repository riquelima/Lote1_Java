/*
 *************************
Lote 01 - Exercício 42    - Esturura de Repetição
42 - Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */


package Estrutura_Seq_Dec_Rep;
import java.util.Scanner;

public class Ex42_EstRep {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int c, fixo = 1;
		double soma = 0 , resultado = 0 ;
		
		for (c = 2; c <= 50; c++ ) {
			soma = fixo + c/(c*2-1);
			resultado = (resultado + soma);
			fixo = 0;
			
		}
		System.out.println("A soma dos termos é: " + resultado);	

	}

}
