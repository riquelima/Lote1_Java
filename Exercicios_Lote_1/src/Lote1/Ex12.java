package 
Lote1;

import java.util.Scanner;

public class Ex12 {
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
		System.out.println("A sua idade atual é: " + idade_atual);
		System.out.println("A sua idade daqui 17 anos será: " + idade_futura);			
		
	}

}
