/*
 *************************
Lote 01 - Exercício 28 - Procedimento

28 - Receba o preço atual e a média mensal de um produto. 
Calcule e mostre o novo preço sabendo que: 

VendaMensal       PreçoAtual            Preço         NovoPreco
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
		
		// Coletando o preço e a média de vendas
		System.out.println("Digite o preço atual:");
		preco_atual = in.nextDouble();
		
		System.out.println("Digite a média de vendas no mês:");
		media_venda = in.nextInt();
		
		// Calculando e exibindo o novo preço e desconto
		if ((media_venda < 500)&&(preco_atual < 30)){
			preco_atual = ((preco_atual * 10)/100) + preco_atual;
			System.out.println("O preço sofreu aumento de 10%");
			System.out.println("Novo preço: " + preco_atual);
			
			}else {
				if(((media_venda >= 500)&&(media_venda < 1000))&&((preco_atual >= 30)&&(preco_atual < 80))){
					preco_atual = ((preco_atual * 15)/100) + preco_atual;
					System.out.println("O preço sofreu aumento de 15%");
					System.out.println("Novo preço: " + preco_atual);
					
				}else {
					if((media_venda >= 1000)&&(preco_atual >= 80)){
						preco_atual = ((preco_atual * 5)/100) - (preco_atual);
						preco_atual = preco_atual * (-1);
						System.out.println("O preço sofreu desconto de 5%");
						System.out.println("Novo preço: " + preco_atual);					
					}else {
						preco_atual = preco_atual;
						System.out.println("O preço não sofreu desconto");
						System.out.println("Novo preço: " + preco_atual);
					}
				}
				
				
			}
	}

	public static void main(String[] args) {
		NovoPreco();
		

	}

}
