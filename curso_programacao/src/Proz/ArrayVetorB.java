package Proz;

import java.util.Scanner;

public class ArrayVetorB {

	public static void main(String[] args) {
		/*
		 * Elementos Pares e Ímpares de um Vetor Tarefa: Crie um programa que solicite
		 * ao usuário 10 números, armazene-os em um array e depois exiba os números
		 * pares e ímpares separadamente
		 */
		Scanner scanner = new Scanner(System.in);

		// Criando o array para armazenar os números
		int[] numeros = new int[10];

		// Solicitando os números ao usuário
		System.out.println("Digite 10 números:");

		for (int i = 0; i < 10; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			numeros[i] = scanner.nextInt();
		}

		// Exibindo os números pares
		System.out.println("\nNúmeros pares:");
		for (int numero : numeros) {
			if (numero % 2 == 0) {
				System.out.print(numero + " ");
			}
		}

		// Exibindo os números ímpares
		System.out.println("\n\nNúmeros ímpares:");
		for (int numero : numeros) {
			if (numero % 2 != 0) {
				System.out.print(numero + " ");
			}
		}

		scanner.close();
	}

}
