package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com a quantidade de produtos: ");
		int n = sc.nextInt();
		
		List<Produto> pdt = new ArrayList<>();
		
		for(int i=1; i<=n;i++) {
			System.out.println("Dados do " + i + "º produto:");
			System.out.print("Comum, usado ou importado (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			if(ch == 'u') {
				System.out.print("Data de fabricação: ");
				LocalDate data = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				
				pdt.add(new ProdutoUsado(nome, preco, data));
			} else if (ch == 'i') {
				System.out.print("Taxa de importação: ");
				double txAlfandega = sc.nextDouble();
				
				pdt.add(new ProdutoImportado(nome, preco, txAlfandega));
			} else {
				pdt.add(new Produto(nome, preco));
			}
		}
		
		System.out.println();
		System.out.println("ETIQUETAS DE PRECO:");
		for (Produto prod : pdt) {
			System.out.println(prod.etqPreco());
		}
		
		sc.close();
	}

}
