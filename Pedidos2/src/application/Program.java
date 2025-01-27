package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.ItemPedido;
import entities.Pedido;
import entities.Produto;
import entities.enums.StatusPedido;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Insira os dados do cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Data de nascimento (DD/MM/YYYY): ");
		Date dtNascimento = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente(nome, email, dtNascimento);
		
		System.out.println("Insira os dados do pedido: ");
		
		System.out.print("Status: ");
		StatusPedido status = StatusPedido.valueOf(sc.next());
		
		Pedido pedido = new Pedido(new Date(), status, cliente);
		
		System.out.print("Quantos itens tem no pedido? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Insira os dados do " + i + "º item");
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.print("Preço do produto: ");
			Double precoProduto = sc.nextDouble();
			
			Produto produto = new Produto(nomeProduto,precoProduto);
			
			System.out.print("Quantidade:  ");
			int quantidade = sc.nextInt();
			
			ItemPedido itemPedido = new ItemPedido(quantidade, precoProduto, produto);
			pedido.addItem(itemPedido);			
			
		}
		
		System.out.println();
		System.out.println("Resumo do pedido: ");
		System.out.println(pedido);
		
		
		
		sc.close();
	}

}
