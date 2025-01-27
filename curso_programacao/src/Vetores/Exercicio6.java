package Vetores;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores vai ter cada vetor? ");
		int N = sc.nextInt();
		
		int[] A = new int[N];
		int[] B = new int[N];
		int[] c = new int[N];
		
		System.out.println("Digite os valores do Vetor A: ");
		for(int i = 0; i < N; i++ ) {
			A[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do Vetor B: ");
		for(int i = 0; i < N; i++ ) {
			B[i] = sc.nextInt();
		}
		
		for (int i=0; i<N; i++) {
	        c[i] = A[i] + B[i];
	    }

	    System.out.println("VETOR RESULTANTE:");

	    for (int i=0; i<N; i++) {
	    	System.out.printf("%d\n", c[i]);
	    }
		
		sc.close();
	}

}
