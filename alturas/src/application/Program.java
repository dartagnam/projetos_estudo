package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double altTotal, nmMenores;
		
		altTotal = 0.0;
		nmMenores = 0.0;

		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		Pessoas[] vetor = new Pessoas[n];
		
		for (int i=0; i < vetor.length; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i + 1) + "ª pessoa:");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vetor[i] = new Pessoas(nome,idade,altura);
		}
		
		for (int i=0; i < vetor.length; i++) {
			altTotal += vetor[i].getAltura();
			
			if (vetor[i].getIdade() < 16) {
				nmMenores++;
			}
		}
		
		double mediaAltura = altTotal / vetor.length;
		double percentual = nmMenores * 100.0 / vetor.length;
		
		System.out.printf("\nAltura media = %.2f\n", mediaAltura);
	    System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentual);
	    
	    for (int i=0; i < vetor.length; i++) {
			if (vetor[i].getIdade() < 16) {
				System.out.println(vetor[i].getNome());
			}
		}
			
		sc.close();
	}

}
