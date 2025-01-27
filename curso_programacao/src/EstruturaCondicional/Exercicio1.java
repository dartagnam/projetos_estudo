package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro, e depois dizer se este número é
		// negativo ou não.

		Scanner sc = new Scanner(System.in);

		int x;

		System.out.print("Digite um número para saber se é NEGATIVO ou NAO NEGATIVO: ");
		x = sc.nextInt();

		if (x >= 0) {
			System.out.println("NAO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}

		sc.close();
	}

}
