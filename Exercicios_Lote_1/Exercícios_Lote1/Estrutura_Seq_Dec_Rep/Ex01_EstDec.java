/*
 *************************
Lote 01 - Exerc�cio 1 - Estrutura Decis�o

1 - Coletar o valor do lado de um quadrado, calcular sua �rea
e apresentar o resultado.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Estrutura_Seq_Dec_Rep;

import java.util.Scanner;

public class Ex01_EstDec {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int lado, area;  // Declarando as variáveis
		
		// Lendo entrada de dados
		System.out.println("Digite o valor do lado do quadrado:");
		lado = in.nextInt();
		
		// Calculando o valor da área
		area = lado * lado;
		
		// Exibindo resultado
		System.out.println("A área do quadrado é:" + area);
	
	}

}
