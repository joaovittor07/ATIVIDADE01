			package ATIVIDADE01;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		/* Faça um Programa que pergunte quanto você ganha por hora 
		   e o número de horas trabalhadas no mês. Calcule e mostre 
		   o total do seu salário no referido mês, sabendo-se que 
		   são descontados 11% para o Imposto de Renda, 8% para o 
		   INSS e 5% para o sindicato, faça um programa que nos dê:
		   	  a. salário bruto.
			  b. quanto pagou ao IR.
			  c. quanto pagou ao INSS.
			  d. quanto pagou ao sindicato.
              e. o salário líquido.
			  f. calcule os descontos e o salário líquido, conforme a tabela abaixo:
			  g. + Salário Bruto : R$
			  h. - IR (11%) : R$
			  i. - INSS (8%) : R$,
			  j. - Sindicato ( 5%) : R$
			  k. = Salário Liquido : R$
		   Obs.: Salário Bruto - Descontos = Salário Líquido.*/
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Informe quanto você ganha por Hora: ");
		
			int ValorHora = s.nextInt();
			
		System.out.print("Informe quantsas horas você Trabalha: ");
		
			int Horas = s.nextInt();
			
		int SalarioBruto =  (ValorHora * Horas);
		System.out.print("\na. Seu Salario Bruto é: " + SalarioBruto);
		
		int IR = ((SalarioBruto * 11) / 100);
		System.out.print("\nh. O valor pogo no IR é: " + IR);
		
		int INSS = ((SalarioBruto * 8) / 100);
		System.out.print("\nc. O Valor pago do INSS é: " + INSS);
		
		int Sindicato = ((SalarioBruto * 5) / 100);
		System.out.print("\nd. O Valor pago ao Sindicato é: " + Sindicato);
		
		int SalarioLiquido = (SalarioBruto - INSS - Sindicato);
		System.out.print("\ne. O Valor do Salario Liquido é: " + SalarioLiquido);
		
		System.out.print("\nf. TABELA: ");
		
		System.out.print("\ng. Salario Bruto : R$ " + SalarioBruto);
		
		int DescontoIR = (SalarioBruto - IR);
		System.out.print("\nh. IR (11%) : R$ " + DescontoIR);
		
		int DescontoINSS = (SalarioBruto - INSS);
		System.out.print("\ni. INSS (8%) : R$ " + DescontoINSS);
		
		int DescontoSindicato = (SalarioBruto - Sindicato);
		System.out.print("\nj. Sindicato ( 5%) : R$ " + DescontoSindicato);
		
		System.out.print("\nk. Salário Liquido : R$ " + SalarioLiquido);
		
		s.close();
		
	}

}
