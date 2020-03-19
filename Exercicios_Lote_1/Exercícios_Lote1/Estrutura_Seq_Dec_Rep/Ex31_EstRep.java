/*
 *************************
Lote 01 - Exercício 31 - Estrutura Repetição

31 - Calcule e mostre o quadrado dos números entre 10 e 150.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Estrutura_Seq_Dec_Rep;
import java.util.Scanner;

public class Ex31_EstRep {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i,j, quadrado;
		
		for(i= 10, j= 150; i <= j; i++) {  //Inicia variável i e j, realiza operação, incrementa variável a ser calculada
			quadrado = (i * i);
			System.out.println("O quadrado de " + i + " = " + quadrado);			
		}
	}

}
