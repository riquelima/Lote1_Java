package Vetores;
import java.util.Scanner;


public class Ex02_Vetores {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Declara��o de vari�veis
		int v[] = new int[5];
		int i=0, maior=0, menor=0;
		double media=0;
		
		// Entrada de dados
		for(i=0; i <= 4; i++) {
			System.out.println("Digite um n�mero:");
			v[i] = in.nextInt();	
			media = media + v[i];	
			if(v[i] > maior) {
				maior = v[i];				
			}else { 
				if (v[i] < menor) {
				menor = v[i];					
				}
				
			}
		}
		media = media / 5;
		System.out.println("M�DIA = " + media);
		System.out.println("MAIOR N�MERO = " + maior);
		System.out.println("MENOR N�MERO = " + menor);


		
				
		
		
		
		
		
		
	}

}
