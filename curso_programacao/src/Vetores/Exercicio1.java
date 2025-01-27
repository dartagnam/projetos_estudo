package Vetores;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros você vai digitar? ");
		int N = sc.nextInt();
		
		int[] vect = new int[N];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite o " + (i+1) + "º numero: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS: ");
		
		for(int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				System.out.printf("%d\n", vect[i]);
			}
		}
		sc.close();
	}

}
