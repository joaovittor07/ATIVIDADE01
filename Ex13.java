package ATIVIDADE01;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		/* João Papo-de-Pescador, homem de bem, comprou um microcomputador 
		   para controlar o rendimento diário de seu trabalho. Toda vez que 
		   ele traz um peso de peixes maior que o estabelecido pelo regulamento 
		   de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de 
		   R$ 4,00 por quilo excedente. João precisa que você faça um programa 
		   que leia a variável peso (peso de peixes) e verifique se há excesso.
		   Se houver, gravar na variável excesso e na variável multa o valor da 
		   multa que João deverá pagar. Caso contrário mostrar tais variáveis 
		   com o conteúdo ZERO OU NEGATIVO.*/
		
		Scanner s = new Scanner (System.in); 

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o peso do seu peixe: ");
        double peso = scanner.nextDouble();

        scanner.close();

        if (peso <= 50.0) {
        	
            System.out.println("O peso está dentro do limite permitido. Peso: " + peso + " kg");
      
        } else {
            
        	double excesso = peso - 50.0;
            double multa = excesso * 4.0;
            
            System.out.println("Excesso de peso é: " + excesso + " kg");
            System.out.println("Valor da multa é: R$" + multa);
        }
        
        s.close();
        
    }
}
