/*
 *************************
Lote 01 - Exerc�cio 8 - Estrutura Decis�o

8 - Receba o valor de um dep�sito em poupan�a. Calcule e mostre o valor ap�s 1 m�s de aplica��o
 sabendo que rende 1,3% a. m.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Estrutura_Seq_Dec_Rep;

import java.util.Scanner;

public class Ex08_EstDec {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double valor, rendimento;
		
		// Entrada de dados
		System.out.println("Digite o valor a ser aplicado:");
		valor = in.nextDouble();
		
		// Calculando a aplicação
		rendimento = valor + (valor*0.013);
		
		// Exibindo resultado
		System.out.println("Após um mês o saldo com o rendimento será:" + rendimento);
		
	}
	

}
