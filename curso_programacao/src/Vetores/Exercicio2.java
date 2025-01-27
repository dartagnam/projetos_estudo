package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros você vai digitar? ");
		int N = sc.nextInt();
		
		double[] vetor = new double[N];
		
		for(int i=0; i < vetor.length; i++) {
			System.out.print("Digite o " + (i +1) + "º numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0;
		for(int i=0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		
		double media = soma / vetor.length;
		
		System.out.print("\nValores = " );
		for (int i=0; i<vetor.length; i++) {
	    	System.out.printf("%.1f  ", vetor[i]);
	    }
		
		System.out.printf("\nSOMA = %.2f%n", soma);
		System.out.printf("MEDIA = %.2f%n", media);
		
		sc.close();
	}

}
