/*
 *************************
Lote 01 - Exercício 42  - Função
42 - Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Metodos;

public class Ex42_Funcao {

	public static void main(String[] args) {
		
		MostraSerie();

	}
	
	public static void MostraSerie() {
		int c, fixo = 1;
		double soma = 0 , resultado = 0 ;
		
		for (c = 2; c <= 50; c++ ) {
			soma = fixo + c/(c*2-1);
			resultado = (resultado + soma);
			fixo = 0;
		}
		System.out.println("A soma dos termos é: " + resultado);	
	}

}
