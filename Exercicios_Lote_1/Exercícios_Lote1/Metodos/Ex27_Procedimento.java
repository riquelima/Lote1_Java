/*
 *************************
Lote 01 - Exercício 27 - Procedimento

27 - Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). 
Calcule e mostre a velocidade média em km/h.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Metodos;
import java.util.Scanner;


public class Ex27_Procedimento {
	
	public static void VelocidadeMedia() {
		Scanner in = new Scanner(System.in);
		int voltas, tempo, extensao;
		double velocidade_media;
		
		System.out.println("Digite o número de voltas.");
		voltas = in.nextInt();
		
		System.out.println("Digite o tempo de duração em minutos");
		tempo = in.nextInt();
		
		System.out.println("Digite a extensão do circuito em metros");
		extensao = in.nextInt();
		
		extensao = (extensao * voltas);
		velocidade_media = (extensao / tempo);
		
		System.out.println("A velocidade média é de " + velocidade_media + " KM/h");
	}

	public static void main(String[] args) {
		
		VelocidadeMedia();
		

	}

}
