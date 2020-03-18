/*
 *************************
Lote 01 - Exercício 6 - Estrutura Decisão

6 - Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */


package Estrutura_Seq_Dec_Rep;

import java.util.Scanner;

public class Ex06_EstDec {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x, y, aux;
		
		// Entrada de dados
		System.out.println("Digite um valor para x: ");
		x = in.nextInt();
		
		System.out.println("Digite um valor para y:");
		y = in.nextInt();
		
		// Realizando a troca dos valores
		aux = x;
		x = y;
		y = aux;
		
		// Exibindo os valores 
		System.out.println(" X = " + x);
		System.out.println(" Y = " + aux);
		
	}

}