package Vetores;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros você vai digitar? ");
		int N = sc.nextInt();
		
		int[] vetor = new int[N];
		int cont = 0;
		
		for(int i = 0; i < N; i++ ) {
			System.out.print("Digite o " + (i + 1) + "º numero: ");
			vetor[i] = sc.nextInt();
		}
		
		
		System.out.println("NUMEROS PARES: ");
		for(int i = 0; i < N; i++ ) {
			if (vetor[i] % 2 == 0) {
				cont ++;
				System.out.print(" " + vetor[i]);
			}
		}
		
		System.out.print("\nQUANTIDADE DE PARES = " + cont);

		sc.close();
	}

}
