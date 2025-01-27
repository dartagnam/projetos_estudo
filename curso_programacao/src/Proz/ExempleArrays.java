package Proz;

import java.util.Locale;
import java.util.Scanner;

public class ExempleArrays {

	public static void main(String[] args) {
				Locale.setDefault(Locale.US);
				Scanner sc = new Scanner(System.in);
				
				int N = sc.nextInt();
				sc.nextLine();
				double[] price = new double [N];
				String[] name = new String [N];
				
				for(int i = 0; i < N; i++) {
					System.out.print("Digite o nome do produto: ");
					name[i] = sc.nextLine();
					
					System.out.print("Digite o preço do produto: ");
					price[i] = sc.nextDouble();
					sc.nextLine();
				}
				
				double sum = 0;
				for(int i = 0; i< N;i++) {
					sum += price[i];
				}
				
				double avg = sum / N;
				
				System.out.println();
				System.out.printf("AVERAGE PRICE = %.2f%n", avg);
				
				sc.close();
			}



}
