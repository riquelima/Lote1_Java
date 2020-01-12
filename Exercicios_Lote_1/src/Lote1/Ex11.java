package Lote1;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double raio, comprimento, pi;
		
		// Entrada de dados
		System.out.println("Digite o raio da circunferência");
		raio = in.nextDouble();
		
		// Calculando o comprimento
		pi = 3.14;
		comprimento = 2 * pi * raio;
		
		// Exibindo resultado
		System.out.println("O comprimento da circunferência é:" + comprimento);
		
	}

}
