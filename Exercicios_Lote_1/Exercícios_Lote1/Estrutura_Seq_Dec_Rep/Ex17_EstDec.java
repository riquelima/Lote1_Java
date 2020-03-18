/*
 *************************
Lote 01 - Exerc�cio 17 - Estrutura Decis�o

17 - Calcule a quantidade de litros gastos em uma viagem, sabendo que o autom�vel faz 12 km/l.
Receber o tempo de percurso e a velocidade m�dia.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Estrutura_Seq_Dec_Rep;

import java.util.Scanner;

public class Ex17_EstDec {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tempo, velocidade, distancia;
		double litrosgastos; 
		
		// Entrada de dados
		System.out.println("Digite o tempo de percurso em horas:");
		tempo = in.nextInt();
		
		System.out.println("Digite a  velocidade m�dia");
		velocidade = in.nextInt();
		
		// Calculando a quantidade de litros gastos
		distancia = velocidade * tempo;
		litrosgastos = distancia / 12;
				
		// Exibindo o resultado
		
		System.out.println("A quantidade de litros gastos foi:" + litrosgastos + " litros");	


	}

}
