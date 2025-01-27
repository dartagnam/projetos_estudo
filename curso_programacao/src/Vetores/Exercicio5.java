package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros você vai digitar? ");
		int N = sc.nextInt();

		double[] vetor = new double[N];
		double maior = 0;
		int p = 0;

		for (int i = 0; i < N; i++) {

			System.out.print("Digite o " + (i + 1) + "º numero: ");
			vetor[i] = sc.nextDouble();
		}

		for (int i = 0; i < N; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
				p = i;
			}
		}

		System.out.printf("\nMAIOR VALOR = %.1f%n", maior);
		System.out.println("POSIÇÃO DO MAIOR VALOR = " + p);

		sc.close();
	}

}
