package ATIVIDADE01;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		/* Fa�a um Programa que pergunte quanto voc� ganha por hora 
		   e o n�mero de horas trabalhadas no m�s. Calcule e mostre 
		   o total do seu sal�rio no referido m�s.*/
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Informe o valor que voc� Ganha por Hora: ");
		
			int hora = s.nextInt();
			
		System.out.print("Informe quantas horas voc� trabalha por dia: ");
		
			int dia = s.nextInt();
			
		double total = hora * dia;
		
		System.out.print("O valo que voc� vai receber �: " + total);
	
		s.close();
		
	}

}
