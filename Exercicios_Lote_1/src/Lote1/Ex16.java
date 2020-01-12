package Lote1;

import java.util.Scanner;

public class Ex16 {
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
