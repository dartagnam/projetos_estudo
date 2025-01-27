package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregados;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Empregados> empregados = new ArrayList<>();
		
		
		System.out.print("Quantos funcionários serão cadastrados?" );
		int n = sc.nextInt();
		
		for(int i=0; i < n; i++) {
			System.out.println((i+1) + "º empregado: ");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine(); 
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();
			
			Empregados emp = new Empregados(id, nome, salario);
			empregados.add(emp);				
		}
		
		System.out.println();
		System.out.print("Informe o ID do funcionário que terá aumento salarial: ");
		int idSalario = sc.nextInt();
		
		Empregados hasId = empregados.stream().filter(x -> x.getId() == idSalario).findFirst().orElse(null);
		if (hasId == null) {
			System.out.println("Este ID não existe!");
		} else {
			System.out.print("Insira a porcentagem: ");
			double porcentagem = sc.nextDouble();
			hasId.incremento(porcentagem);
		}
		
		System.out.println();
		System.out.println("Lista de empregados: ");
		for(Empregados emp : empregados) {
			System.out.println(emp);
		}
		
		sc.close();
	}

}
