package Vetores;
import java.util.Scanner;

public class Ex01_Vetores {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		
		// Declarando vari�veis
		int vet[] = new int [5];
		int soma_impar = 0;
		int i = 0;
		double media = 0;
		
		// Entrada de dados e manipula��o		
		for(i= 0; i <= 4; i++){
			System.out.println("Digite um valor:");
			vet[i] = in.nextInt();
			
			if((vet[i] >= 10)&&(vet[i] <= 200)){
				media = media + vet[i];				
			}			
		}
		media= (media/190); // Coletando valor da m�dia dos n�meros entre 10 e 200
		
		for (i = 0; i <= 4; i++) {
			if(vet[i]%2 == 1) {
				soma_impar = soma_impar + vet[i];				
			}
		}
		System.out.println("M�DIA DOS N�MEROS ENTRE 10 E 200:" + media);
		System.out.println("SOMA DOS N�MEROS �MPARES" + soma_impar);

				

	}

}
