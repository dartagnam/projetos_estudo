package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// Fazer um programa que leia o número de um funcionário, seu número de horas
		// trabalhadas, o valor que recebe por
		// hora e calcula o salário desse funcionário. A seguir, mostre o número e o
		// salário do funcionário, com duas casas
		// decimais.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o código do funcionário: ");
		int number = sc.nextInt();
		System.out.print("Digite as horas trabalhadas pelo funcionário: ");
		int hrTrabalhadas = sc.nextInt();
		System.out.print("Digite o valor das horas: ");
		double vrHrTrabalhada = sc.nextDouble();
		System.out.println();
		
		double salary = hrTrabalhadas * vrHrTrabalhada;
		
		System.out.println("NUMBER = "+number);
		System.out.printf("SALARY = U$ %.2f%n",salary);
		
		sc.close();
	}

}
