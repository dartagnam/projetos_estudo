package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Fazer um programa que leia três valores com ponto flutuante de dupla
		// precisão: A, B e C. Em seguida, calcule e
		// mostre:
		// a) a área do triângulo retângulo que tem A por base e C por altura.
		// b) a área do círculo de raio C. (pi = 3.14159)
		// c) a área do trapézio que tem A e B por bases e C por altura.
		// d) a área do quadrado que tem lado B.
		// e) a área do retângulo que tem lados A e B.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double pi = 3.14159;

		double triangulo = A * C / 2;
		double circulo = pi * (C * C);
		double trapezio = ((A + B) * C) / 2;
		double quadrado = B * B;
		double retangulo = A * B;

		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);

		sc.close();
	}

}
