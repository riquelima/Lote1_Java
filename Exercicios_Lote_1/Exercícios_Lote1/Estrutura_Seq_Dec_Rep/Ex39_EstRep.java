/*
 *************************
Lote 01 - Exercício 39 - Estrutura de Repetição
39 - Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
Casa:   1 2 3 4 ... 64
Qte:    1 2 4 8 ... N

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Estrutura_Seq_Dec_Rep;
import java.util.Scanner;


public class Ex39_EstRep {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int casa, quantidade = 2;
		int i;
		
		for (casa =1 ; casa <= 64; casa++) {
			if (casa == 1) {
				quantidade = 1;
				System.out.println("CASA = " + casa + " --- QNT = " + quantidade);
			} else if (casa >= 2) {
				quantidade = (quantidade + quantidade);
				System.out.println("CASA = " + casa + " --- QNT = " + quantidade);
								
			} 
		}
		

		
	}

}
