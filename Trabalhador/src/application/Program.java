package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ContratoHr;
import entities.Departamento;
import entities.Funcionarios;
import entities.enuns.NivelFuncionario;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Qual é o departamento? ");
		String departamento = sc.nextLine();
		System.out.println("Entre com os dados do funcionário:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Nivel: ");
		String nivel = sc.nextLine();
		System.out.print("Salario Base: ");
		double salarioBase = sc.nextDouble();
		Funcionarios funcionarios = new Funcionarios(nome, NivelFuncionario.valueOf(nivel), salarioBase, new Departamento(departamento));
		
		System.out.print("Quantos contratos tem esse funcionario? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Entre com o dados do " + i + "º contrato:");
			System.out.print("Data (DD/MM/YYYY): ");
			Date dataContrato = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double vlrHr = sc.nextDouble();
			System.out.print("Duração: ");
			int hrTrabalhadas = sc.nextInt();
			ContratoHr contrato = new ContratoHr(dataContrato, vlrHr, hrTrabalhadas);
			funcionarios.addContrato(contrato);
			
		}
		
		System.out.println();
		System.out.println("Insira o mês e o ano para calcular a renda (MM/YYYY): ");
		String meseAno = sc.next();
		int mes = Integer.parseInt(meseAno.substring(0, 2));
		int ano = Integer.parseInt(meseAno.substring(3));
		System.out.println("Name: " + funcionarios.getNome());
		System.out.println("Departamento " + funcionarios.getDepartamento().getNome());
		System.out.println("Renda em " + meseAno + ": " + String.format("%.2f", funcionarios.renda(ano, mes)));
		
		sc.close();
	}

}
