/*
 *************************
Lote 01 - Exercício 1 - Estrutura Decisão

1 - Coletar o valor do lado de um quadrado, calcular sua área
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
		int lado, area;  // Declarando as variÃ¡veis
		
		// Lendo entrada de dados
		System.out.println("Digite o valor do lado do quadrado:");
		lado = in.nextInt();
		
		// Calculando o valor da Ã¡rea
		area = lado * lado;
		
		// Exibindo resultado
		System.out.println("A Ã¡rea do quadrado Ã©:" + area);
	
	}

}
