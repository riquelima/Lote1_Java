/*
 *************************
Lote 01 - Exerc�cio 16 - Procedimento

16 - Receba a quantidade de horas trabalhadas, o valor por hora,
 o percentual de desconto e o n�mero de descendentes. 
 Calcule o sal�rio que ser�o as horas trabalhadas x o valor por hora.
 Calcule o sal�rio l�quido (= Sal�rio Bruto � desconto).
 A cada dependente ser� acrescido R$ 100 no Sal�rio L�quido. Exiba o sal�rio a receber.

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

package Metodos;

import java.util.Scanner;

public class Ex16_Procedimento {   // Cria��o do procedimento
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		CalcSalario(); // <--- chamada de procedimento
	
	}
    
	public static void CalcSalario() {	
		Scanner in = new Scanner(System.in); // Procedimento
		
		int horas_trabalhadas=0, valor_hora=0, dependentes=0;
		double desconto=0, salario_bruto=0, salario_liquido=0; 		
		
		// Entrada de dados
				System.out.println("Digite a quantidade de horas trabalhadas:");
				horas_trabalhadas = in.nextInt();		
				System.out.println("Digite o valor/hora trabalhada:");
				valor_hora = in.nextInt();		
				System.out.println("Digite o percentual de desconto:");
				desconto = in.nextInt();		
				System.out.println("Digite a quantidade de dependentes:");
				dependentes = in.nextInt();
		
		desconto = desconto/100;
		dependentes = dependentes * 100;
		salario_bruto = (horas_trabalhadas * valor_hora);
        salario_liquido =  salario_bruto - (salario_bruto * desconto) + dependentes;
        
        // Exibindo resultado
        System.out.println("O sal�rio bruto � : " + salario_bruto);
        System.out.println("O desconto �: " + desconto);
        System.out.println("O sal�rio l�quido �: " + salario_liquido);
	
	
}

}