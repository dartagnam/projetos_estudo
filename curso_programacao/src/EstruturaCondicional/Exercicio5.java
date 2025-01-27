package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o código do item desejado: ");
		int codItem = sc.nextInt();
		System.out.print("Digite a quantidade desejada: ");
		int qtdItem = sc.nextInt();

		if (codItem > 0 && codItem < 6) {

			if (codItem == 1) {
				double total = qtdItem * 4.00;
				System.out.printf("Total: R$ %.2f%n", total);
			} else if (codItem == 2) {
				double total = qtdItem * 4.50;
				System.out.printf("Total: R$ %.2f%n", total);
			} else if (codItem == 3) {
				double total = qtdItem * 5.00;
				System.out.printf("Total: R$ %.2f%n", total);
			} else if (codItem == 4) {
				double total = qtdItem * 2.00;
				System.out.printf("Total: R$ %.2f%n", total);
			} else if (codItem == 5) {
				double total = qtdItem * 1.50;
				System.out.printf("Total: R$ %.2f%n", total);
			}
		} else {
			System.out.println("Código Inválido!");
		}

		sc.close();
	}

}
