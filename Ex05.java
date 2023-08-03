package ATIVIDADE01;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		/* Faça um Programa que converta metros para centímetros.*/
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Insira um valor para Metro: ");
		
			int metro = s.nextInt();
		
			int total = (metro * 100);
			
		System.out.print("\nO valor em Centimetro: " + total);
		
		s.close();

	}

}
