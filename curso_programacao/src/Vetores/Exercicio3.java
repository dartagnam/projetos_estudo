package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas ? ");
		int N = sc.nextInt();

		String[] nome = new String[N];
		int[] idade = new int[N];
		double[] altura = new double[N];

		for (int i = 0; i < N; i++) {
			System.out.println("Dados da " + (i + 1) + "ª pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
		}

		double soma = 0;
		for (int i = 0; i < N; i++) {
			soma += altura[i];
		}

		double media = soma / N;

		int nDeMenores = 0;
		for (int i = 0; i < N; i++) {
			if (idade[i] < 16) {
				nDeMenores += 1;
			}

		}
		double percentualMenores = ((double) nDeMenores / N) * 100.0;

		System.out.printf("\nAltura media = %.2f\n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

		for (int i = 0; i < N; i++) {
			if (idade[i] < 16) {
				System.out.printf("%s\n", nome[i]);
			}

		}
		sc.close();
	}
}
