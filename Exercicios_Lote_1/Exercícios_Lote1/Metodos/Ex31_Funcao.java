/*
 *************************
Lote 01 - Exerc�cio 31 - Fun��o

32 - Calcule e mostre o quadrado dos n�meros entre 10 e 150.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Metodos;

public class Ex31_Funcao {
	
	public static int Quadrado(int x) { // Func�o calcula quadrado
		int quadrado;
		quadrado = x*x;
		return quadrado;
	}
		
	public static void main(String[] args) {
        int i;
		
		for(i= 10; i <= 150; i++) {  
			Quadrado(i);
			System.out.println("O quadrado de " + i + " = " + Quadrado(i));

	 }
  }
}


