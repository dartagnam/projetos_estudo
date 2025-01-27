package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Conta;
import model.exceptions.BusinessException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados da conta: ");
		System.out.print("Numero da conta: ");
		int num = sc.nextInt();
		System.out.print("Titular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Saldo inicial: ");
		double saldo = sc.nextDouble();
		System.out.print("Limite de saque: ");
		double limiteSaque = sc.nextDouble();
		
		Conta conta = new Conta(num, titular, saldo, limiteSaque);
		
		System.out.println();
		System.out.print("Insira o valor para saque: ");
		double quantia = sc.nextDouble();
		
		try {
			conta.saque(quantia);
			System.out.printf("Novo saldo: %.2f%n", conta.getSaldo());
		}
		catch(BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
