package ATIVIDADE01;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		/* Fa�a um Programa que pe�a o raio de um c�rculo, 
		   calcule e mostre sua �rea.*/

		Scanner s = new Scanner (System.in);

		System.out.print("Insira o valor do Raio: ");
		
			int raio = s.nextInt();
			
		double area = (3.14 * Math.pow(raio, 2))/2;
		
		System.out.print("\nO valor da Area �: " + area);
		
		s.close();
	}

}
