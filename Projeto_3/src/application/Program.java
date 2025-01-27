package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Student std = new Student();
		
		System.out.print("Digite o nome do aluno: ");
		std.nome = sc.nextLine();
		System.out.print("Digite a 1ª nota: ");
		std.nota1 = sc.nextDouble();
		System.out.print("Digite a 2ª nota: ");
		std.nota2 = sc.nextDouble();
		System.out.print("Digite a ultima nota: ");
		std.nota3 = sc.nextDouble();
		
		System.out.println();
		System.out.printf("FINAL GRADE = %.2f%n", std.notaFinal());
		
		if (std.notaFinal() >= 60) {
			System.out.println("PASS");
		}else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", std.pontosFaltantes());
		}
		
		sc.close();
	}

}
