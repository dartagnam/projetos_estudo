package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();

		System.out.print("Nome: ");
		emp.name = sc.nextLine();
		System.out.print("Salario: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Taxa: ");
		emp.tax = sc.nextDouble();

		System.out.println();
		System.out.println("Empregado: " + emp);

		System.out.println();
		System.out.print("Qual o percentual de incremento de salário? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);

		System.out.println();
		System.out.println("Dados atualizados: " + emp);

		sc.close();
	}

}
