package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros você vai digitar ? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for (int i=0; i < vetor.length; i++) {
			System.out.print("Digite o " + (i+1) + "º numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		int posicao = 0;
		double maior = 0.0;
		for (int i=0; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
				posicao = i;
			}
		}
		
		System.out.println();
		System.out.println("MAIOR VALOR = " + maior);
		System.out.println("POSICAO DO MAIOR VALOR = " + posicao);
		
		sc.close();
	}

}
