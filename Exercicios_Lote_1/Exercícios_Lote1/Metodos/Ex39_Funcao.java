/*
 *************************
Lote 01 - Exerc�cio 39 - Fun��o
39 - Calcule a quantidade de gr�os contidos em um tabuleiro de xadrez onde:
Casa:   1 2 3 4 ... 64
Qte:    1 2 4 8 ... N

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Metodos;

public class Ex39_Funcao {

	public static void main(String[] args) {

		double casa = 1;
				
		for (casa = 1; casa <= 64; casa++) {
		System.out.println("CASA " + casa + " = " + Quantidade(casa));
		
		}
	}
	

	public static double Quantidade(double c) {   // Fun��o Calcula Quantidade de Gr�os
		
			if (c == 1) {
				return 1;
			} else{
				if (c == 2){
					return 2;
			}else {
				if (c >= 2) {
					return Math.pow(2, (c-1));				
				}
			}
			return Math.pow(c,2);
		
}
		

	}
}


