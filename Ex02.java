package ATIVIDADE01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		/* Fa�a um Programa que pe�a um n�mero e ent�o mostre a 
		   mensagem O n�mero informado foi [n�mero].*/
	
		Scanner s = new Scanner (System.in);
		
		System.out.print("Insira um N�mero: ");
		
			int num = s.nextInt();
			
		System.out.print("\nO n�mero informado foi: " + num);
		
		s.close();

	}

}
