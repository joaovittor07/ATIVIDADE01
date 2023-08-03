package ATIVIDADE01;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		/* Faça um Programa que peça 2 números inteiros e um número 
		   real. Calcule e mostre:
              a. o produto do dobro do primeiro com metade do segundo.
              b. a soma do triplo do primeiro com o terceiro.
              c. o terceiro elevado ao cubo.*/

		Scanner s = new Scanner (System.in);
		
		System.out.print("Informe o 1º Número Inteiro: ");
		
			double num1 = s.nextInt();
		
		System.out.print("\nInforme o 2º Número Inteiro: ");
		
			double num2 = s.nextInt();
		
		System.out.print("\nInforme o Número Real: ");
		
			double num3 = s.nextDouble();
			
		double a = (2 * num1) * (num2 / 2);
		
		System.out.print("\nO Resultado de A é: " + a);
		
		double b = ((num1 * 3) + num3);
		
		System.out.print("\nO Resultado de B é: " + b);
		
		double c = (Math.pow(num3, 3));
			
		System.out.print("\nO Resultado de C é: " + c);
		
		s.close();
	}

}
