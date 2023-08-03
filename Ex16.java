package ATIVIDADE01;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		/* Fa�a um Programa para uma loja de tintas. O programa dever� pedir o 
		   tamanho em metros quadrados da �rea a ser pintada. Considere que a 
		   cobertura da tinta � de 1 litro para cada 6 metros quadrados e que 
		   a tinta � vendida em latas de 18 litros, que custam R$ 80,00 ou em 
		   gal�es de 3,6 litros, que custam R$ 25,00.
		   	 - Informe ao usu�rio as quantidades de tinta a serem compradas e 
		   	   os respectivos pre�os em 2 situa��es:
		   	 - comprar apenas latas de 18 litros;
		     - comprar apenas gal�es de 3,6 litros; */
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Informe o Valor em Metros Quadrados: ");
		int MQ = s.nextInt();
			
		int TintaMetro = (MQ / 6);
		System.out.print("\nVoc� vai usar " + TintaMetro + " Litros de Tinta");
		
		double LitroTinta = (int) Math.ceil((double) TintaMetro / 18); // Essa parte arrendodou o valor que antes estava dando s� 0, para 1
		System.out.print("\nVoc� vai ter que comprar " + LitroTinta + " Litros de Tinta");

		double ValorTinta = (LitroTinta * 80);
		System.out.print("\nComo voc� Comprou " + LitroTinta + " Litros de Tinta, Vai ter que Pagar: R$ " + ValorTinta);
		
		double Galoes = (int) Math.ceil((double) TintaMetro / 3.6);
		System.out.print("\nA quantidade em Gal�es �: " + Galoes);
		
		double ValorGaloes = (Galoes * 25);
		System.out.print("\nO valor dos Litros de Gal�es �: " + ValorGaloes);
		
		s.close();
	}

}
