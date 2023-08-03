package ATIVIDADE01;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		/* Tendo como dados de entrada a altura de uma pessoa, 
		   construa um algoritmo que calcule seu peso ideal, 
		   usando a seguinte fórmula: (72.7*altura) – 58. */
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Informe sua Altura: ");
		
			double altura = s.nextDouble();
		
		double total = ((72.7 * altura) - 58);
		
		System.out.print("Seu Peso Ideal é:" + total);
		
		s.close();
		
	}

}
