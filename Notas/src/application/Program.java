package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student st = new Student();
		
		System.out.print("Digite o nome do Aluno: ");
		st.nome = sc.nextLine();
		
		System.out.println("Digite as notas dos 3 trimestres: ");
		st.nota1 = sc.nextDouble();
		st.nota2 = sc.nextDouble();
		st.nota3 = sc.nextDouble();
		
		System.out.printf("NOTA FINAL: %.2f%n", st.notaFinal());
		
		if (st.notaFinal() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("FALTARAM %.2f PONTOS", st.pontosFaltantes());
		} else {
			System.out.println("PASS");
		}
		
		sc.close();

	}

}
