package Estrutura_Seq_Dec_Rep;
import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int nasc_ano, nasc_mes, nasc_dia, ano_atual, mes_atual, dia_atual;
		int idade_ano, idade_mes, idade_dia;
		
		// Coletando informações de nascimento -------------
		System.out.println("Digite o ano de nascimento:");
		nasc_ano = in.nextInt();
		
		System.out.println("Digite o mes de nascimento:");
		nasc_mes = in.nextInt();
				
		System.out.println("Digite o dia de nascimento:");
		nasc_dia = in.nextInt();
		
		
		// Coletando informações do ano atual --------------
		System.out.println("Em que ano estamos?");
		ano_atual = in.nextInt();
		
		System.out.println("Em qual mês estamos?");
		mes_atual = in.nextInt();
		
		System.out.println("Em qual data estamos?");
		dia_atual = in.nextInt();
		
		// Descobrindo a idade
		idade_ano = (ano_atual - nasc_ano);
		idade_mes = (mes_atual - nasc_mes);
		idade_dia = (dia_atual- nasc_dia);
		if (idade_mes < 0) {
			idade_mes = (idade_mes * (-1));
		}
		if (idade_dia < 0) {
			idade_dia = (idade_dia * (-1));			
		}
		
		// Mostrando na tela os resultados
		System.out.println("IDADE ANO: " + idade_ano );
		System.out.println("IDADE MES: " + idade_mes );
		System.out.println("IDADE DIA: " + idade_dia );

		
		
		

		
		
		
		
	}

}
