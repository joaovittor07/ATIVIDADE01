package ATIVIDADE01;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		/* Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador 
		   para controlar o rendimento di�rio de seu trabalho. Toda vez que 
		   ele traz um peso de peixes maior que o estabelecido pelo regulamento 
		   de pesca do estado de S�o Paulo (50 quilos) deve pagar uma multa de 
		   R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um programa 
		   que leia a vari�vel peso (peso de peixes) e verifique se h� excesso.
		   Se houver, gravar na vari�vel excesso e na vari�vel multa o valor da 
		   multa que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis 
		   com o conte�do ZERO OU NEGATIVO.*/
		
		Scanner s = new Scanner (System.in); 

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o peso do seu peixe: ");
        double peso = scanner.nextDouble();

        scanner.close();

        if (peso <= 50.0) {
        	
            System.out.println("O peso est� dentro do limite permitido. Peso: " + peso + " kg");
      
        } else {
            
        	double excesso = peso - 50.0;
            double multa = excesso * 4.0;
            
            System.out.println("Excesso de peso �: " + excesso + " kg");
            System.out.println("Valor da multa �: R$" + multa);
        }
        
        s.close();
        
    }
}
