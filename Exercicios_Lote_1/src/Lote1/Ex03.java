package Lote1;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int base, altura, area;
		
		// Lendo entrada de dados
		System.out.println("Digite a base do triângulo:");
		base = in.nextInt();
		
		System.out.println("Digite a altura do triângulo:");
		altura = in.nextInt();
		
		// Calculando a area
		area = (base * altura)/2;
		
		// Mostrando o resultado
		System.out.println("A área do triângulo é:" + area);	

	}

}
