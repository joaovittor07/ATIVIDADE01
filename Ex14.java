			package ATIVIDADE01;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		/* Fa�a um Programa que pergunte quanto voc� ganha por hora 
		   e o n�mero de horas trabalhadas no m�s. Calcule e mostre 
		   o total do seu sal�rio no referido m�s, sabendo-se que 
		   s�o descontados 11% para o Imposto de Renda, 8% para o 
		   INSS e 5% para o sindicato, fa�a um programa que nos d�:
		   	  a. sal�rio bruto.
			  b. quanto pagou ao IR.
			  c. quanto pagou ao INSS.
			  d. quanto pagou ao sindicato.
              e. o sal�rio l�quido.
			  f. calcule os descontos e o sal�rio l�quido, conforme a tabela abaixo:
			  g. + Sal�rio Bruto : R$
			  h. - IR (11%) : R$
			  i. - INSS (8%) : R$,
			  j. - Sindicato ( 5%) : R$
			  k. = Sal�rio Liquido : R$
		   Obs.: Sal�rio Bruto - Descontos = Sal�rio L�quido.*/
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Informe quanto voc� ganha por Hora: ");
		
			int ValorHora = s.nextInt();
			
		System.out.print("Informe quantsas horas voc� Trabalha: ");
		
			int Horas = s.nextInt();
			
		int SalarioBruto =  (ValorHora * Horas);
		System.out.print("\na. Seu Salario Bruto �: " + SalarioBruto);
		
		int IR = ((SalarioBruto * 11) / 100);
		System.out.print("\nh. O valor pogo no IR �: " + IR);
		
		int INSS = ((SalarioBruto * 8) / 100);
		System.out.print("\nc. O Valor pago do INSS �: " + INSS);
		
		int Sindicato = ((SalarioBruto * 5) / 100);
		System.out.print("\nd. O Valor pago ao Sindicato �: " + Sindicato);
		
		int SalarioLiquido = (SalarioBruto - INSS - Sindicato);
		System.out.print("\ne. O Valor do Salario Liquido �: " + SalarioLiquido);
		
		System.out.print("\nf. TABELA: ");
		
		System.out.print("\ng. Salario Bruto : R$ " + SalarioBruto);
		
		int DescontoIR = (SalarioBruto - IR);
		System.out.print("\nh. IR (11%) : R$ " + DescontoIR);
		
		int DescontoINSS = (SalarioBruto - INSS);
		System.out.print("\ni. INSS (8%) : R$ " + DescontoINSS);
		
		int DescontoSindicato = (SalarioBruto - Sindicato);
		System.out.print("\nj. Sindicato ( 5%) : R$ " + DescontoSindicato);
		
		System.out.print("\nk. Sal�rio Liquido : R$ " + SalarioLiquido);
		
		s.close();
		
	}

}
