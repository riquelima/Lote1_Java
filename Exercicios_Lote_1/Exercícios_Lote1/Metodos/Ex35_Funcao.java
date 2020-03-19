/*
 +++++++++++++++++++++++++++++++++++
 
Lote 01 - Exerc�cio 35 - Fun��o

35 - Receba 2 n�meros inteiros, verifique qual o maior entre eles. Calcule e
mostre o resultado da somat�ria dos n�meros �mpares entre esses valores.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi

 +++++++++++++++++++++++++++++++++++++
 */

package Metodos;
import java.util.Scanner;


public class Ex35_Funcao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = in.nextInt();
		
		System.out.println("Digite o segundo n�mero");
		num2 = in.nextInt();
		
		VerificaMaior(num1, num2);
		
		System.out.println(" O maior n�mero �: " + VerificaMaior(num1, num2));
		System.out.println("A soma dos �mpares: " + num1 + " e " + num2 + " � = " + SomaImpar(num1,num2));

	}
	
	public static int VerificaMaior(int x, int y) {  // Fun��o Verifica Maior
		if (x > y) {
			return x;
			
		}else {
			return y;
		}
		
	}

   
	public static int SomaImpar(int x, int y) { // Fun��o Soma �mpar
		int i, soma=0;
	    if (x < y) {
	    	for (i=x; i <= y; i++) {
	    		if (i%2==1) {
	    			soma = soma + i;
	    		}
	  
	    	}
	    }else {
	    	for (i=y; i <= x; i++) {
	    		if (i%2==1) {
	    			soma = soma + i;
	    		}
	    	}
	    	
	    }
	    return soma;
		
	}
		
}
