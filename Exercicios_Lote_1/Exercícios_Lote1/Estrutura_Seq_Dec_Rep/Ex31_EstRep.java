/*
 *************************
Lote 01 - Exerc�cio 31 - Estrutura Repeti��o

31 - Calcule e mostre o quadrado dos n�meros entre 10 e 150.

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
		
		for(i= 10, j= 150; i <= j; i++) {  //Inicia vari�vel i e j, realiza opera��o, incrementa vari�vel a ser calculada
			quadrado = (i * i);
			System.out.println("O quadrado de " + i + " = " + quadrado);			
		}
	}

}
