package ATIVIDADE01;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		/* Fa�a um Programa que pe�a as 4 notas bimestrais e 
		   mostre a m�dia.*/
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Insira a 1� Nota: ");
		
			int nota1 = s.nextInt();
		
		System.out.print("\nInsira a 2� Nota: ");
		
			int nota2 = s.nextInt();
		
		System.out.print("\nInsira a 3� Nota: ");
		
			int nota3 = s.nextInt();
		
		System.out.print("\nInsira a 4� Nota: ");
		
			int nota4 = s.nextInt();
			
		int total = ((nota1 + nota2 + nota3 + nota4) / 4);
		
		System.out.print("\nA Nota Final �: " + total);
		
		s.close();
	}

}
