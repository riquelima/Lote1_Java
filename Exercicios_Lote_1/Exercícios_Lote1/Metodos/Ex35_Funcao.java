/*
 +++++++++++++++++++++++++++++++++++
 
Lote 01 - Exercício 35 - Função

35 - Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e
mostre o resultado da somatória dos números ímpares entre esses valores.

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
		
		System.out.println("Digite o primeiro número: ");
		num1 = in.nextInt();
		
		System.out.println("Digite o segundo número");
		num2 = in.nextInt();
		
		VerificaMaior(num1, num2);
		
		System.out.println(" O maior número é: " + VerificaMaior(num1, num2));
		System.out.println("A soma dos ímpares: " + num1 + " e " + num2 + " é = " + SomaImpar(num1,num2));

	}
	
	public static int VerificaMaior(int x, int y) {  // Função Verifica Maior
		if (x > y) {
			return x;
			
		}else {
			return y;
		}
		
	}

   
	public static int SomaImpar(int x, int y) { // Função Soma Ímpar
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
