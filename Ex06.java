package ATIVIDADE01;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		/* Faça um Programa que peça o raio de um círculo, 
		   calcule e mostre sua área.*/

		Scanner s = new Scanner (System.in);

		System.out.print("Insira o valor do Raio: ");
		
			int raio = s.nextInt();
			
		double area = (3.14 * Math.pow(raio, 2))/2;
		
		System.out.print("\nO valor da Area é: " + area);
		
		s.close();
	}

}
