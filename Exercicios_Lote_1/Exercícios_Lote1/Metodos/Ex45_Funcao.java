/*
 *************************
Lote 01 - Exerc�cio 45
45 - Calcule e mostre a s�rie 1 � 2/4 + 3/9 � 4/16 + 5/25 + ... + 15/225

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Metodos;

public class Ex45_Funcao {

	public static void main(String[] args) {
		
		Serie();

	}
	
	public static void Serie() {
		int i, j;
		double soma1, soma2, soma3, resultado=0;
		
		
		for (i = 1; 1 <= 15; i++) {
			if ( i == 1) {
				soma1 = i - (i+1)/Math.pow((i+1),(i+1));
			}else 
				if(i == 3){
					soma2 = i - (i+1)/Math.pow((i+1),(i+1));	
			}else {
					soma3 = i - (i+1)/Math.pow((i+1),(i+1));					
				}
			}
		
	}

}
