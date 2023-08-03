package ATIVIDADE01;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		/* Faça um Programa para uma loja de tintas. O programa deverá pedir o 
		   tamanho em metros quadrados da área a ser pintada. Considere que a 
		   cobertura da tinta é de 1 litro para cada 6 metros quadrados e que 
		   a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em 
		   galões de 3,6 litros, que custam R$ 25,00.
		   	 - Informe ao usuário as quantidades de tinta a serem compradas e 
		   	   os respectivos preços em 2 situações:
		   	 - comprar apenas latas de 18 litros;
		     - comprar apenas galões de 3,6 litros; */
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Informe o Valor em Metros Quadrados: ");
		int MQ = s.nextInt();
			
		int TintaMetro = (MQ / 6);
		System.out.print("\nVocê vai usar " + TintaMetro + " Litros de Tinta");
		
		double LitroTinta = (int) Math.ceil((double) TintaMetro / 18); // Essa parte arrendodou o valor que antes estava dando só 0, para 1
		System.out.print("\nVocê vai ter que comprar " + LitroTinta + " Litros de Tinta");

		double ValorTinta = (LitroTinta * 80);
		System.out.print("\nComo você Comprou " + LitroTinta + " Litros de Tinta, Vai ter que Pagar: R$ " + ValorTinta);
		
		double Galoes = (int) Math.ceil((double) TintaMetro / 3.6);
		System.out.print("\nA quantidade em Galões é: " + Galoes);
		
		double ValorGaloes = (Galoes * 25);
		System.out.print("\nO valor dos Litros de Galões é: " + ValorGaloes);
		
		s.close();
	}

}
