package ATIVIDADE01;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		/* Fa�a um Programa que calcule e mostre a �rea de 
		   um quadrado.*/
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Insira o valor do Lado do Quadrado: ");
		
			int lado = s.nextInt();
			
		int total = (int) (Math.pow(lado, 2));
		
		System.out.print("\nO valor da Area do Quadrado �: " + total);
		
		s.close();

	}

}
