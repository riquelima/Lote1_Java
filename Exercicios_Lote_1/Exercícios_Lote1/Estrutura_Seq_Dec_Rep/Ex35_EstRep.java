/*
 +++++++++++++++++++++++++++++++++++
 
Lote 01 - Exerc�cio 35 - Estrutura Repeti��o

35 - Receba 2 n�meros inteiros, verifique qual o maior entre eles. Calcule e
mostre o resultado da somat�ria dos n�meros �mpares entre esses valores.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi

 +++++++++++++++++++++++++++++++++++++
 */

package Estrutura_Seq_Dec_Rep;
import java.util.Scanner;

public class Ex35_EstRep {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1, num2, i, soma = 0;
		
		System.out.println("Digite o primeiro valor:");
		num1 = in.nextInt();
		
		System.out.println("Digite o segundo valor:");
		num2 = in.nextInt();
		
		if (num1 > num2) {
            for (i = num2; i <= num1; i++) {
                if (i % 2 != 0) {
                    soma = soma + i;
                }
                
            }
            
            System.out.println("O maior n�mero � = "+num1);
            System.out.println("A soma dos �mpares entre " + num2 + " e " + num1 +" = " + soma);
       
		} else {
            for (i = num1; (i <= num2); i++) {
                if (i % 2 != 0) {
                    soma = soma + i;
                }
              
            }
            
            System.out.println("O maior n�mero � = "+num2);
            System.out.println("A soma dos �mpares entre " + num1 + " e " + num2 +" = " + soma);
        }
	}
}


