package ATIVIDADE01;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		/* Faça um Programa que peça as 4 notas bimestrais e 
		   mostre a média.*/
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Insira a 1º Nota: ");
		
			int nota1 = s.nextInt();
		
		System.out.print("\nInsira a 2º Nota: ");
		
			int nota2 = s.nextInt();
		
		System.out.print("\nInsira a 3º Nota: ");
		
			int nota3 = s.nextInt();
		
		System.out.print("\nInsira a 4º Nota: ");
		
			int nota4 = s.nextInt();
			
		int total = ((nota1 + nota2 + nota3 + nota4) / 4);
		
		System.out.print("\nA Nota Final é: " + total);
		
		s.close();
	}

}
