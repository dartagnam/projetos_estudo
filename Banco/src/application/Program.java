package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Entre com o número da conta: ");
		int nrConta = sc.nextInt();
		System.out.print("Entre com o nome do titular da conta: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Vai efetuar um depósito inicial (y/n) ? ");
		char resposta = sc.next().charAt(0);
		if (resposta == 'y') {
			System.out.print("Entre com o valor de depósito inicial: ");
			double dpInicial = sc.nextDouble();
			conta = new Conta(nrConta, titular, dpInicial);
		} else {
			conta = new Conta(nrConta, titular);
		}
		
		System.out.println();
		System.out.println("Dados da Conta: ");
		System.out.println(conta); 
		
		System.out.println();
		System.out.print("Entre com um valor para depósito: ");
		double vrDeposito = sc.nextDouble();
		conta.deposito(vrDeposito);
		System.out.println("Dados da conta atualizado: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Entre com um valor para saque: ");
		double vrSaque = sc.nextDouble();
		conta.saque(vrSaque);
		System.out.println("Dados da conta atualizado: ");
		System.out.println(conta);
		
		sc.close();
	}

}
