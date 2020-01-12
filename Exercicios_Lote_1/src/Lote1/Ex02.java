package Lote1;

import java.util.Scanner;

public class Ex02 {
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
