/*
 *************************
Lote 01 - Exerc�cio 2 - Estrutura Decis�o

2 - Receba o sal�rio de um funcion�rio e mostre o novo sal�rio com reajuste de 15%.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Estrutura_Seq_Dec_Rep;

import java.util.Scanner;

public class Ex02_EstDec {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double salario, reajuste;
		
		// Lendo entrada de dados
		System.out.println("Digite o salário:");
		salario = in.nextDouble();
		
		// Calculando o valor do reajuste
		reajuste = salario + (salario * 0.15);
		
		// Mostrando o novo salário
		System.out.println("O salário com o reajuste de 15% é:"+ reajuste);
				
	}
		
}
