package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
		// valor da área deste círculo com quatro
		// casas decimais conforme exemplos.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double pi = 3.14159;

		System.out.print("Digite o valor do raio de um círculo: ");
		double raio = sc.nextDouble();

		double area = pi * (raio * raio);

		System.out.printf("AREA = %.4f%n", area);

		sc.close();
	}

}
