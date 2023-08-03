package ATIVIDADE01;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		/* Faça um programa para uma loja de tintas. O programa deverá pedir o 
		   tamanho em metros quadrados da área a ser pintada. Considere que a 
		   cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a 
		   tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao 
		   usuário a quantidades de latas de tinta a serem compradas e o preço total. */
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Informe o Valor em Metros Quadrados: ");
		int MQ = s.nextInt();
			
		int TintaMetro = (MQ / 3);
		System.out.print("\nVocê vai usar " + TintaMetro + " Litros de Tinta");
		
		double LitroTinta = (int) Math.ceil((double) TintaMetro / 18); // Essa parte arrendodou o valor que antes estava dando só 0, para 1
		System.out.print("\nVocê vai ter que comprar " + LitroTinta + " Litros de Tinta");

		double ValorTinta = LitroTinta * 80;
		System.out.print("\nComo você Comprou " + LitroTinta + " Litros de Tinta, Vai ter que Pagar: R$ " + ValorTinta);
		
		s.close();
	}

}
