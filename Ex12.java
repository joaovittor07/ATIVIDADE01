package ATIVIDADE01;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		/* Tendo como dado de entrada a altura, construa um algoritmo que 
		   calcule seu peso ideal, utilizando as seguintes fórmulas:
		   	- Para homens: (72.7*h) - 58
			- Para mulheres: (62.1*h) - 44.7 (h = altura) */
		
			Scanner s = new Scanner (System.in);
			
			System.out.print("Informe a sua Altura: ");
			
				double h = s.nextInt();
			
				double T1 = (62.1*h) - 44.7;
			
				double T2 = (72.7*h) - 58; 
			
			System.out.print("Digite [ F ou M ]: ");
			
			String letra = s.nextLine();
			
			if (letra.equalsIgnoreCase("Seu Peso Ideal é: " + T1)) {
				
			
			}else if(letra.equalsIgnoreCase("Seu Peso Ideal é: " + T2)) {
				
			
			}else {
			
				System.out.print("Tem que ser F ou M");
				
			}
			
			s.close();

	}

}
