package Lote1;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int quantidadekg, quantidadegm, duracao;
		
		// Entrada de dados
		System.out.println("Digite a quantidade de alimentos em kg:");
		quantidadekg = in.nextInt();
		
		// Calculando quantos dias durará o alimento
		quantidadegm = quantidadekg * 1000 ; // <--- Quantidade em gramas
		duracao = quantidadegm/50;
		
		// Exibindo resultados 
		System.out.println("A duração do alimento será de " + duracao + " dias");
		
	}

}
