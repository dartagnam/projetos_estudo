package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pensionato;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		
		Pensionato[] quartos = new Pensionato[10];
		
		for (int i=0; i < n; i++) {
			System.out.println((i+1) + "º quarto: ");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Nº do quarto: ");
			int quarto = sc.nextInt();
			
			quartos[quarto] = new Pensionato(nome,email);
			
		}
		
		System.out.println();
		System.out.println("Quartos alugados: ");
		for (int i=0; i < quartos.length; i++) {
			if(quartos[i] != null) {
				System.out.println(i + ": " + quartos[i]);
			}
		}
		
		sc.close();
	}

}
