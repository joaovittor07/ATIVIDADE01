package ATIVIDADE01;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		/* Fa�a um Programa que pe�a 2 n�meros inteiros e um n�mero 
		   real. Calcule e mostre:
              a. o produto do dobro do primeiro com metade do segundo.
              b. a soma do triplo do primeiro com o terceiro.
              c. o terceiro elevado ao cubo.*/

		Scanner s = new Scanner (System.in);
		
		System.out.print("Informe o 1� N�mero Inteiro: ");
		
			double num1 = s.nextInt();
		
		System.out.print("\nInforme o 2� N�mero Inteiro: ");
		
			double num2 = s.nextInt();
		
		System.out.print("\nInforme o N�mero Real: ");
		
			double num3 = s.nextDouble();
			
		double a = (2 * num1) * (num2 / 2);
		
		System.out.print("\nO Resultado de A �: " + a);
		
		double b = ((num1 * 3) + num3);
		
		System.out.print("\nO Resultado de B �: " + b);
		
		double c = (Math.pow(num3, 3));
			
		System.out.print("\nO Resultado de C �: " + c);
		
		s.close();
	}

}
