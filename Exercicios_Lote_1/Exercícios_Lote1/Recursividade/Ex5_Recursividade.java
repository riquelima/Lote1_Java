package Recursividade;
/*
 *************************
Exercício 5 - Recursividade 
5 - Serie5 = Serie5 = (N)! + (N-1)! + (N-2)! + ... + (1)!  

Programador: Henrique Souza Lima
Professor: Ricardo Satoshi
 *************************
 */

import java.util.Scanner;
public class Ex5_Recursividade {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número: ");
		num = in.nextInt();
		
		Serie5(num);
		Fatorial(num);
		
		System.out.println("O fatorial é: " + Fatorial(num));
	}
	
public static int Serie5(int n){ // Série recursiva da soma
        
        if(n == 1){
            
            return 1;
        }
        
        return Fatorial(n) + Serie5(n - 1);
        
    }
    public static int Fatorial(int x){ // Série recursiva do fatorial
        
        if(x == 0){
            
            return 1;
        }
        
        return x * Fatorial(x - 1);
        
    }
    
}