package Lote1;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int largura, altura, comprimento, volume;
		
		// Entrada de dados
		System.out.println("Digite a largura");
		largura = in.nextInt();
		
		System.out.println("Digite a altura");
		altura = in.nextInt();
		
		System.out.println("Digite o comprimento");
		comprimento = in.nextInt();
		
		// Calculando o volume
		volume = largura * altura * comprimento;
		
		// Exibindo resultado
		System.out.println("O volume é: " + volume);		
	}

}
