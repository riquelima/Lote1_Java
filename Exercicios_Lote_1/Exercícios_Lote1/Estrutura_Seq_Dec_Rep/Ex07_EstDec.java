/*
 *************************
Lote 01 - Exerc�cio 7 - Estrutura Decis�o

7 - Receba os valores do comprimento, largura e altura de um paralelep�pedo.
Calcule e mostre seu volume.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Estrutura_Seq_Dec_Rep;

import java.util.Scanner;

public class Ex07_EstDec {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int largura, altura, comprimento, volume;
		
		// Entrada de dados
		System.out.println("Digite a largura");
		largura = in.nextInt();
		
		System.out.println("Digite a altura");
		altura = in.nextInt();
		
		System.out.println("Digite o comprimento");
		comprimento = in.nextInt();
		
		// Calculando o volume
		volume = largura * altura * comprimento;
		
		// Exibindo resultado
		System.out.println("O volume é: " + volume);		
	}

}
