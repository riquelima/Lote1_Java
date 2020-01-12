package Lote1;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b, c;
		double delta, x1, x2;
		
		// Entrada de dados
		System.out.println("Digite um valor para A");
		a = in.nextInt();
		
		System.out.println("Digite um valor para B");
		b = in.nextInt();
		
		System.out.println("Digite um valor para C");
		c = in.nextInt();
		
		// Descobrindo o valor de DELTA, X1 e X2
		delta = ((b*b) - 4*a*c);
		x1 = (-(b)- Math.sqrt(delta))/2*a;
		x2 = (-(b)+ Math.sqrt(delta))/2*a;
		
		// Exibindo resultado
		System.out.println("O valor de delta é: " + delta);
		System.out.println("O valor de x1: " + x1);
		System.out.println("O valor de x2 é: " + x2);
				
	}

}
