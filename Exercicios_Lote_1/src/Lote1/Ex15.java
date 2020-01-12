package Lote1;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double cateto1, cateto2, hipotenusa;
		
		// Entrada de dados
		System.out.println("Digite o valor do 1º cateto:");
		cateto1 = in.nextInt();
		
		System.out.println("Digite o valor do 2º cateto:");
		cateto2 = in.nextInt();
		
		// Calculando o valor da hipotenusa
		hipotenusa = (cateto1 * cateto1) + (cateto2 * cateto2);
		resultado = Math.sqrt(hipotenusa);
		
		// Exibindo resultado
		System.out.println("O valor da hipotenusa é: " + Math.sqrt(hipotenusa));		
		
	}

}
