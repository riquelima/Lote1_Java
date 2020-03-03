package Lote1;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tempo, velocidade, distancia;
		double litrosgastos; 
		
		// Entrada de dados
		System.out.println("Digite o tempo de percurso em horas:");
		tempo = in.nextInt();
		
		System.out.println("Digite a  velocidade média");
		velocidade = in.nextInt();
		
		// Calculando a quantidade de litros gastos
		distancia = velocidade * tempo;
		litrosgastos = distancia / 12;
				
		// Exibindo o resultado
		
		System.out.println("A quantidade de litros gastos foi:" + litrosgastos + " litros");	


	}

}
