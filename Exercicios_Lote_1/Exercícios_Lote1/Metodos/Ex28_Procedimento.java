/*
 *************************
Lote 01 - Exerc�cio 28 - Procedimento

28 - Receba o pre�o atual e a m�dia mensal de um produto. 
Calcule e mostre o novo pre�o sabendo que: 

VendaMensal       Pre�oAtual            Pre�o         NovoPreco
< 500                 < 30               +               +10% 
>= 500 e < 1000       >= 30 e < 80       +15%             -
>= 1000                >= 80             - 5%             -5%

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Metodos;
import java.util.Scanner;

public class Ex28_Procedimento {
	
	public static void NovoPreco() {
		Scanner in = new Scanner(System.in);
		double preco_atual, novo_preco;
		int media_venda;
		
		// Coletando o pre�o e a m�dia de vendas
		System.out.println("Digite o pre�o atual:");
		preco_atual = in.nextDouble();
		
		System.out.println("Digite a m�dia de vendas no m�s:");
		media_venda = in.nextInt();
		
		// Calculando e exibindo o novo pre�o e desconto
		if ((media_venda < 500)&&(preco_atual < 30)){
			preco_atual = ((preco_atual * 10)/100) + preco_atual;
			System.out.println("O pre�o sofreu aumento de 10%");
			System.out.println("Novo pre�o: " + preco_atual);
			
			}else {
				if(((media_venda >= 500)&&(media_venda < 1000))&&((preco_atual >= 30)&&(preco_atual < 80))){
					preco_atual = ((preco_atual * 15)/100) + preco_atual;
					System.out.println("O pre�o sofreu aumento de 15%");
					System.out.println("Novo pre�o: " + preco_atual);
					
				}else {
					if((media_venda >= 1000)&&(preco_atual >= 80)){
						preco_atual = ((preco_atual * 5)/100) - (preco_atual);
						preco_atual = preco_atual * (-1);
						System.out.println("O pre�o sofreu desconto de 5%");
						System.out.println("Novo pre�o: " + preco_atual);					
					}else {
						preco_atual = preco_atual;
						System.out.println("O pre�o n�o sofreu desconto");
						System.out.println("Novo pre�o: " + preco_atual);
					}
				}
				
				
			}
	}

	public static void main(String[] args) {
		NovoPreco();
		

	}

}
