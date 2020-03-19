/*
 *************************
Lote 01 - Exercício 43   - Estrutura de Repetição
43 - Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria 
sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Estrutura_Seq_Dec_Rep;

public class Ex43_EstRep {

	public static void main(String[] args) {

		double ana = 1.10, maria= 1.50;
		int tempo=0; 
		
		while (ana < maria){
			ana = ana + 0.3;
			maria = maria + 0.2;
			tempo = tempo + 1;			
			if( ana > maria) {
				System.out.println("Ana será maior do que maria em " + tempo + " anos");
				
			}
			
		}
		
		
	}

}
