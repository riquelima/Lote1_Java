/*
 *************************
Lote 01 - Exerc�cio 27 - Estrutura Decis�o

27 - Receba o n�mero de voltas, a extens�o do circuito (em metros) e o tempo de dura��o (minutos). 
Calcule e mostre a velocidade m�dia em km/h.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Estrutura_Seq_Dec_Rep;
import java.util.Scanner;


public class Ex27_EstDec {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int voltas, tempo, extensao;
		double velocidade_media;
		
		System.out.println("Digite o n�mero de voltas.");
		voltas = in.nextInt();
		
		System.out.println("Digite o tempo de dura��o em minutos");
		tempo = in.nextInt();
		
		System.out.println("Digite a extens�o do circuito em metros");
		extensao = in.nextInt();
		
		extensao = (extensao * voltas);
		velocidade_media = (extensao / tempo);
		
		
		System.out.println("A velocidade m�dia � de " + velocidade_media + " KM/h");
		
		
		
		

	}

}
