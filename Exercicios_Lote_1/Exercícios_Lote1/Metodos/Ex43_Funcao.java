/*
 *************************
Lote 01 - Exerc�cio 43  - Func�o
43 - Calcule e mostre quantos anos ser�o necess�rios para que Ana seja maior que Maria 
sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Metodos;

public class Ex43_Funcao {

	public static void main(String[] args) {
		
		CalculaAnos();
		
	}
	
	public static void CalculaAnos() {
		double ana = 1.10, maria= 1.50;
		int tempo=0; 
		
		while (ana < maria){
			ana = ana + 0.3;
			maria = maria + 0.2;
			tempo = tempo + 1;			
			if( ana > maria) {
				System.out.println("Ana ser� maior do que maria em " + tempo + " anos");
				
			}
			
		}
		
		
	}

}
