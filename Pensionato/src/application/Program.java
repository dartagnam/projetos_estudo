package application;

import java.util.Locale;
import java.util.Scanner;

import entities.pensionato;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Quantos quartos serao alugados?  ");
		int n = sc.nextInt();
		
		pensionato[] vetor = new pensionato[10];
		
		for(int i = 1; i <= n; i++) {
			System.out.println( i + "º quarto: ");
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Quarto: ");
			int roomNumber = sc.nextInt();
			System.out.println();
			pensionato r = new pensionato(name,email);
			vetor[roomNumber] = r;
		}
		
		System.out.println("Quartos alugados: ");
		
		for (int i = 0; i < 10; i++) {
			if (vetor[i] != null) {
				System.out.println(i + ": " + vetor[i]);
			}
		}
		
		
		sc.close();
	}

}
