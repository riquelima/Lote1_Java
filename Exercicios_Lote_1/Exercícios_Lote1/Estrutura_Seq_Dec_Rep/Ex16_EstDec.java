/*
 *************************
Lote 01 - ExercÌcio 16 - Estrutura Decis„o

16 - Receba a quantidade de horas trabalhadas, o valor por hora,
 o percentual de desconto e o n˙mero de descendentes. 
 Calcule o sal·rio que ser„o as horas trabalhadas x o valor por hora.
 Calcule o sal·rio lÌquido (= Sal·rio Bruto ñ desconto).
 A cada dependente ser· acrescido R$ 100 no Sal·rio LÌquido. Exiba o sal·rio a receber.

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
		
		// Calculando sal√°rio/hora, sal√°rio/liquido, 
		desconto = desconto/100;
		dependentes = dependentes * 100;
		salario_bruto = (horas_trabalhadas * valor_hora);
        salario_liquido =  salario_bruto - (salario_bruto * desconto) + dependentes;
        
        // Exibindo resultado
        System.out.println("O sal√°rio bruto √©: " + salario_bruto);
        System.out.println("O desconto √©: " + desconto);
        System.out.println("O n√∫mero de dependentes √©: " + dependentes);
        System.out.println("O sal√°rio l√≠quido √©: " + salario_liquido);
   		
	}
	

}
