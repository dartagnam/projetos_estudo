package Proz;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayVetorA {

	public static void main(String[] args) {
		/*
		 * Média dos Elementos de um Vetor Tarefa: Crie um programa que solicite ao
		 * usuário N números, armazene-os em um array e depois calcule a média dos
		 * elementos do array.
		 */

		Scanner sc = new Scanner(System.in);

		double media;
		double soma = 0;

		System.out.print("Digite quantos numeros deseja inserir na lista: ");
		int N = sc.nextInt();

		double[] numeros = new double[N];

		for (int i = 0; i < N; i++) {
			System.out.print("Digite o " + (i + 1) + "º numero: ");
			numeros[i] = sc.nextDouble();

		}

		for (double numero : numeros) {
			soma += numero;
		}

		media = soma / N;

		System.out.println();
		System.out.println("Lista: " + Arrays.toString(numeros));
		System.out.println("MEDIA = " + media);

		sc.close();
	}

}
