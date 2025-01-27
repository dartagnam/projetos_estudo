package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
		// valor unitário de cada peça 1, o
		// código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
		// Calcule e mostre o valor a ser pago.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o código da 1ª peça: ");
		int codPeca1 = sc.nextInt();
		System.out.print("Digite a quantidade de peças: ");
		int qtdPecas1 = sc.nextInt();
		System.out.print("Digite o valor unitário da peça: ");
		double vrPeca1 = sc.nextDouble();

		double vrTotal1 = qtdPecas1 * vrPeca1;

		System.out.print("Digite o código da 2ª peça: ");
		int codPeca2 = sc.nextInt();
		System.out.print("Digite a quantidade de peças: ");
		int qtdPecas2 = sc.nextInt();
		System.out.print("Digite o valor unitário da peça: ");
		double vrPeca2 = sc.nextDouble();

		double vrTotal2 = qtdPecas2 * vrPeca2;

		double vrTotalGeral = vrTotal1 + vrTotal2;

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", vrTotalGeral);

		sc.close();
	}

}
