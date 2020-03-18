/*
 *************************
Lote 01 - Exercício 13 - Estrutura Decisão

13 - Receba a quantidade de alimento em quilos. Calcule e mostre quantos
dias durará esse alimento sabendo que a pessoa consome 50g ao dia.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Estrutura_Seq_Dec_Rep;

import java.util.Scanner;

public class Ex13_EstDec {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int quantidadekg, quantidadegm, duracao;
		
		// Entrada de dados
		System.out.println("Digite a quantidade de alimentos em kg:");
		quantidadekg = in.nextInt();
		
		// Calculando quantos dias durarÃ¡ o alimento
		quantidadegm = quantidadekg * 1000 ; // <--- Quantidade em gramas
		duracao = quantidadegm/50;
		
		// Exibindo resultados 
		System.out.println("A duraÃ§Ã£o do alimento serÃ¡ de " + duracao + " dias");
		
	}

}
