package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTerceiro;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o número de funcionários: ");
		int n = sc.nextInt();
		
		List<Funcionario> funcionarios = new ArrayList<>();
		
		for(int i=1; i<=n;i++) {
			System.out.println("Dados do " + i + "º funcionário:");
			System.out.print("Terceirizado (s/n) ? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			System.out.print("Valor p/ hora: ");
			double vlrHora = sc.nextDouble();
			if(ch == 's') {
				System.out.print("Custo adicional: ");
				double custoAdicional = sc.nextDouble();
				
				funcionarios.add(new FuncionarioTerceiro(nome, horas, vlrHora, custoAdicional));
			} else {
				funcionarios.add(new Funcionario(nome, horas, vlrHora));
			}
		}
		
		System.out.println();
		System.out.println("PAGAMENTOS: ");
		for(Funcionario func : funcionarios) {
			System.out.println(func.getNome() + " - R$ " + String.format("%.2f", func.pagamento()));
		}
		sc.close();
	}

}
