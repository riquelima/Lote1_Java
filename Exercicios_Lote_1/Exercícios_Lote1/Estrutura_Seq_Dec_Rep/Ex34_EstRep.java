/*
 +++++++++++++++++++++++++++++++++++
 
Lote 01 - Exercício 34 - Estrutura Repetição

34 - Receba um número. Calcule e mostre os resultados da tabuada desse número.
Programador: Henrique Souza Lima
Professor: Ricardo Satoshi

 +++++++++++++++++++++++++++++++++++++
 */

package Estrutura_Seq_Dec_Rep;
import java.util.Scanner;

public class Ex34_EstRep {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numero, i, res;
		
		
		// Coletando dados:
		System.out.println("Digite um número:");
		numero = in.nextInt();
       
		// Realizando o cálculo da tabuada e exibindo:
        for (i = 1; i <= 10; i++) {
        	res = numero * i;
            System.out.println(numero+" x " + i + " = " + res);
            }
	 }
}
