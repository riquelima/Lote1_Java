/*
 *************************
Lote 01 - Exerc�cio 21 - Estrutura Decis�o

21 - Receba 4 notas bimestrais de um aluno. Calcule e mostre a m�dia aritm�tica. 
Mostre a mensagem de acordo com a m�dia:

a. Se a m�dia for >= 6,0 exibir �APROVADO�;
b. Se a m�dia for >= 3,0 ou < 6,0 exibir �EXAME�;
c. Se a m�dia for < 3,0 exibir �RETIDO�.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Estrutura_Seq_Dec_Rep;

import java.util.Scanner;

public class Ex21_EstDec {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double nota1, nota2, nota3, nota4, media;
	
		
		// Entrada de Dados
		System.out.println("Digite a primeira nota:");
		nota1= in.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		nota2= in.nextDouble();
		
		System.out.println("Digite a terceira nota:");
		nota3= in.nextDouble();
		
		System.out.println("Digite a quarta nota:");
		nota4= in.nextDouble();
	
		// Manipula��o de dados para descobrir a media
		
		media = (nota1+nota2+nota3+nota4)/4;
				
		// Verficando Status de Aprovado, Reprovado ou Exame
		System.out.println("M�DIA = "+ media);
		
		if(media >= 6) {
			System.out.print("APROVADO");
		}else {
			if((media >= 3)&&(media < 6)) {;
				System.out.println("EXAME");				
			}else {
				if (media < 3){
					System.out.println("REPROVADO");
					
				}
					
				}
		}

	}

}
