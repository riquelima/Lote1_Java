/*
 *************************
Lote 01 - Exerc�cio 16 - Estrutura Decis�o

16 - Receba a quantidade de horas trabalhadas, o valor por hora,
 o percentual de desconto e o n�mero de descendentes. 
 Calcule o sal�rio que ser�o as horas trabalhadas x o valor por hora.
 Calcule o sal�rio l�quido (= Sal�rio Bruto � desconto).
 A cada dependente ser� acrescido R$ 100 no Sal�rio L�quido. Exiba o sal�rio a receber.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */


package Estrutura_Seq_Dec_Rep;

import java.util.Scanner;

public class Ex16_EstDec {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int horas_trabalhadas, valor_hora, dependentes;
		double desconto, salario_bruto, salario_liquido;  
		
		// Entrada de dados
		System.out.println("Digite a quantidade de horas trabalhadas:");
		horas_trabalhadas = in.nextInt();
		
		System.out.println("Digite o valor/hora trabalhada:");
		valor_hora = in.nextInt();
		
		System.out.println("Digite o percentual de desconto:");
		desconto = in.nextInt();
		
		System.out.println("Digite a quantidade de dependentes:");
		dependentes = in.nextInt();
		
		// Calculando salário/hora, salário/liquido, 
		desconto = desconto/100;
		dependentes = dependentes * 100;
		salario_bruto = (horas_trabalhadas * valor_hora);
        salario_liquido =  salario_bruto - (salario_bruto * desconto) + dependentes;
        
        // Exibindo resultado
        System.out.println("O salário bruto é: " + salario_bruto);
        System.out.println("O desconto é: " + desconto);
        System.out.println("O número de dependentes é: " + dependentes);
        System.out.println("O salário líquido é: " + salario_liquido);
   		
	}
	

}
