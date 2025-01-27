package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Quantos numeros você vai digitar ? ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for (int i=0; i < vetor.length; i++) {
			System.out.print("Digite o " + (i+1) + "º numero: ");
			vetor[i] = sc.nextInt();
		}
		
		
		System.out.println("\nNUMEROS PARES:");
		int contador = 0;
		for (int i=0; i<n; i++) {
	        if (vetor[i] % 2 != 1) {
	        	System.out.printf("%d  ", vetor[i]);
	            contador++;
	        }
	    }
		
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + contador);
		
		
		sc.close();
	}

}
