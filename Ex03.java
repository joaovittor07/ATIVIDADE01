package ATIVIDADE01;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		/* Faça um Programa que peça dois números e imprima a soma. */
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Insira o 1º Número: ");
		
			int num1 = s.nextInt();
		
		System.out.print("Insira o 2º Número: ");
		
			int num2 = s.nextInt();
			
		int total = (num1 + num2);
		System.out.print("A soma dos Números é: " + total);
		
		s.close();

	}

}
