package ATIVIDADE01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		/* Faça um Programa que peça um número e então mostre a 
		   mensagem O número informado foi [número].*/
	
		Scanner s = new Scanner (System.in);
		
		System.out.print("Insira um Número: ");
		
			int num = s.nextInt();
			
		System.out.print("\nO número informado foi: " + num);
		
		s.close();

	}

}
