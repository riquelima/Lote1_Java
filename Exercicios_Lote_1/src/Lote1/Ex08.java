package Lote1;

import java.util.Scanner;

public class Ex08 {
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
