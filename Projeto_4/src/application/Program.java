package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		
		System.out.print("What is the dollar price? ");
		double valordolar = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double dolar = sc.nextDouble();
		double resultado = CurrencyConverter.converter(valordolar, dolar);
		System.out.printf("Amount to be paid in reais = %.2f%n", resultado);
		
		sc.close();
	}

	
	}


