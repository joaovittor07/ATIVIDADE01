package ATIVIDADE01;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		/* Fa�a um Programa que pe�a dois n�meros e imprima a soma. */
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Insira o 1� N�mero: ");
		
			int num1 = s.nextInt();
		
		System.out.print("Insira o 2� N�mero: ");
		
			int num2 = s.nextInt();
			
		int total = (num1 + num2);
		System.out.print("A soma dos N�meros �: " + total);
		
		s.close();

	}

}
