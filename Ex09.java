package ATIVIDADE01;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		/* Faça um Programa que peça a temperatura em graus Farenheit, 
		   transforme e mostre a temeratura em graus Celsius.
           C = (5 * (F-32) / 9) / C = (F – 32) / 1,8 */
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Informe a Temperatura de Farenheit: ");
		
			double f = s.nextDouble();
		
			double total = (5 * (f - 32) / 9);
			
		System.out.print("\nA Temperatura em Graus Celsius é: " + total);

		s.close();
		
	}

}
