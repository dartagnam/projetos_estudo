package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro e dizer se este número é par ou
		// ímpar.

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número para descobrir se é PAR ou ÍMPAR: ");
		int x = sc.nextInt();

		if (x % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("ÍMPAR");
		}

		sc.close();
	}

}
