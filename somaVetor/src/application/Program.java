package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double soma, media;

		System.out.print("Quantos numeros você vai digitar ? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for (int i=0; i < vetor.length; i++) {
			System.out.print("Digite o " + (i+1) + "º numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.print("VALORES =");
		
		soma = 0.0;
		for (int i=0; i < vetor.length; i++) {
			System.out.print(" " + vetor[i]);
			soma += vetor[i];
		}
		
		
		media = soma / vetor.length;
		
		System.out.println();
		System.out.printf("SOMA = %.2f\n", soma);
		System.out.printf("MEDIA = %.2f\n", media);
		
		
		sc.close();
	}

}
