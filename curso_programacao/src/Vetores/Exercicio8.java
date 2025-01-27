package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos Elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double soma = 0;
		double[] vetor = new double[n];
		int cont = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("Digite o " + (i + 1) + "º numero: ");
			vetor[i] = sc.nextDouble();
		}

		for (int i = 0; i < n; i++) {
			if (vetor[i] % 2 == 0) {
				soma += vetor[i];
				cont++;
			}
		}	

			double media = soma / cont;

			if (cont > 0) {
				System.out.printf("MEDIA DOS PARES = %.1f%n", media);
			} else {
				System.out.println("NENHUM NUMERO PAR");
			}

		

		sc.close();
	}

}
