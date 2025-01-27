package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite o " + (i + 1) + "º numero: ");
			vetor[i] = sc.nextDouble();
		}

		double soma = 0;

		for (int i = 0; i < n; i++) {
			soma += vetor[i];

		}

		double media = soma / n;

		System.out.printf("\nMEDIA DO VETOR = %.3f%n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for (int i = 0; i < n; i++) {
			if (vetor[i] < media) {
				System.out.println(vetor[i]);
			}
		}

		sc.close();
	}

}
