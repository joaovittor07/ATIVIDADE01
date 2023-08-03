package ATIVIDADE01;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		/* Faça um Programa que pergunte quanto você ganha por hora 
		   e o número de horas trabalhadas no mês. Calcule e mostre 
		   o total do seu salário no referido mês.*/
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Informe o valor que você Ganha por Hora: ");
		
			int hora = s.nextInt();
			
		System.out.print("Informe quantas horas você trabalha por dia: ");
		
			int dia = s.nextInt();
			
		double total = hora * dia;
		
		System.out.print("O valo que você vai receber é: " + total);
	
		s.close();
		
	}

}
