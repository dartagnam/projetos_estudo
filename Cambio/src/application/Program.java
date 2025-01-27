package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o preço do dólar atualmente? ");
		double vrDolar = sc.nextDouble();
	    System.out.print("Quantos dólares vc quer comprar ? ");
		double vtReais = sc.nextDouble();
		
		double resultado = CurrencyConverter.vrDolar(vrDolar, vtReais);
		
		System.out.printf("Valor a ser pago em reais é R$ %.2f", resultado);
		
		sc.close();
	}

}
