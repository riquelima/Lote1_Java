package Lote1;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int angulo1, angulo2, angulo3;
		
		// Entrada de dados
		System.out.println("Digite o valor do primeiro ângulo");
		angulo1 = in.nextInt();
		
		System.out.println("Digite o valor do segundo ângulo");
		angulo2 = in.nextInt();
		
		// Calculando o valor do terceiro ângulo
		angulo3 = 180 - (angulo1 + angulo2);
		
		// Exibindo resultado
		System.out.println("O terceiro ângulo é de " + angulo3 + " graus");
		
		
	}

}
