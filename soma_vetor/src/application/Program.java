package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros vc vai digitar? ");
		double n = sc.nextDouble();
		
		double[] vect = new double[n]; 
		
		
		
		
		sc.close();
	}

}
