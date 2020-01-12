package Lote1;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double C, F;
		
		// Entrada de dados
		System.out.println("Digite a temperatura em Celsius:");
		C = in.nextDouble();
		
		
		// Convertendo para Farehreint
		F = (9*C+160)/5;
		
		// Mostrando o resultado
		System.out.println("A temperatura em Farehreint é:" + F);
			
	}
}
