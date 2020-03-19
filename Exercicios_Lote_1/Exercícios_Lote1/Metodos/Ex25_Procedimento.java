/*
 *************************
Lote 01 - Exercício 25 - Procedimento

25 - Receba a hora de início e de final de um jogo (HH,MM) sabendo que o tempo máximo é de 24 horas 
e pode começar num dia e terminar noutro.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Metodos;
import java.util.Scanner;

public class Ex25_Procedimento {
	
	public static void CalculaTempo() {
Scanner in = new Scanner(System.in);
		
		int hora_inicio, hora_final, min_inicio, min_final, hora_jogo, min_jogo;
		
		// Entrada de dados
		System.out.println("Digite a hora inicial do jogo:");
		hora_inicio = in.nextInt();
		
		System.out.println("Digite o minuto inicial do jogo:");
		min_inicio = in.nextInt();
		
		System.out.println("Digite a hora final do jogo:");
		hora_final = in.nextInt();
		
		System.out.println("Digite o minuto final do jogo:");
		min_final = in.nextInt();
		
		// Verificando o tempo de jogo
		hora_inicio = hora_inicio * 60; // Convertendo hora incial para minutos
		hora_final = hora_final * 60; // Convertendo hora final para minutos
		
		hora_jogo = (hora_final - hora_inicio); 
		min_jogo = (min_final - min_inicio);
		
		hora_jogo = (hora_jogo/60);
		
		
		System.out.println("A hora total do jogo foi de: " + hora_jogo + " horas.");
		System.out.println("O minuto total do jogo foi de: " + min_jogo + " minutos.");
	}

	public static void main(String[] args) {
		CalculaTempo();

	}

}
