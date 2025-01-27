package Proz;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaDeRepeticaoForB {

	public static void main(String[] args) {
		// Verificação do Maior Número:
		// Crie um programa que recebe 10 valores e ao final imprima o maior número.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double maior = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o " + i + "º número: ");
			double number = sc.nextDouble();

			if (number > maior) {
				maior = number;
			}

		}

		System.out.println("O maior numero digitado foi: " + maior);

		sc.close();
	}

}
