package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


import entities.Contribuinte;
import entities.Fisica;
import entities.Juridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o numero de contribuintes: ");
		int n = sc.nextInt();
		
		List<Contribuinte> contribuintes = new ArrayList<>();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Dados do " + i + "º contribuinte:");
			System.out.print("Pessoa Fisica ou Juridica (f / j): ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			Double renda = sc.nextDouble();
			if(ch == 'f') {
				System.out.print("Despesas com saúde: ");
				Double dspSaude = sc.nextDouble();
				
				contribuintes.add(new Fisica(nome, renda, dspSaude));
			} else {
				System.out.print("Quantidade de funcionários: ");
				int qtdFuncionarios = sc.nextInt();
				
				contribuintes.add(new Juridica(nome, renda, qtdFuncionarios));
			}
		}
		
		double total = 0.0;
		System.out.println();
		System.out.println("IMPOSTOS PAGOS: ");
		for(Contribuinte ctb : contribuintes) {
			System.out.println(ctb.getNome() + ": R$ " + String.format("%.2f", ctb.imposto()));
			total += ctb.imposto();
		}
		
		System.out.println();
		System.out.println("Total dos impostos: R$ " + String.format("%.2f",total));
			
		sc.close();
	}

}
