/*
 *************************
Lote 01 - Exercício 12 - Estrutura Decisão

12 - Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade
 e quantos anos terá daqui a 17 anos.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Estrutura_Seq_Dec_Rep;

import java.util.Scanner;

public class Ex12_EstDec {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ano_nascimento, ano_atual, idade_atual, idade_futura;
		
		// Entrada de dados
		System.out.println("Digite o ano do nascimento:");
		ano_nascimento = in.nextInt();
		
		System.out.println("Digite o ano atual:");
		ano_atual = in.nextInt();
		
		// Calculando a idade atual e a idade futura
		idade_atual = (ano_atual - ano_nascimento);
		idade_futura = (idade_atual + 17);
		
		// Exibindo resultados
		System.out.println("A sua idade atual Ã©: " + idade_atual);
		System.out.println("A sua idade daqui 17 anos serÃ¡: " + idade_futura);			
		
	}

}
