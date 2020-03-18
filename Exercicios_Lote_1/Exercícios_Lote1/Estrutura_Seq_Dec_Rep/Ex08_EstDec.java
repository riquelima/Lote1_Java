/*
 *************************
Lote 01 - Exercício 8 - Estrutura Decisão

8 - Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação
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
		
		// Calculando a aplicaÃ§Ã£o
		rendimento = valor + (valor*0.013);
		
		// Exibindo resultado
		System.out.println("ApÃ³s um mÃªs o saldo com o rendimento serÃ¡:" + rendimento);
		
	}
	

}
