package Proz;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaDeRepeticaoC {

	public static void main(String[] args) {
		// Verificação da Média dos alunos:
		// Tarefa: Criar um programa que receba 10 notas parciais, calcular a média
		// final. Tambem apresente a condição da média, se a nota do aluno for maior ou
		// igual a 7.0 imprime no console "Aprovado", se a nota for menor que 7.0 e
		// maior do que 4.0 imprime no console "Recuperação", caso contrário imprime no
		// console "Reprovado".
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int cont = 0;
		double total = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite a " + i + "ª nota do aluno: ");
			double nota = sc.nextDouble();
			
			if (nota >= 0 && nota <= 10) {
				cont = cont + 1;
				total = total + nota;
			}else {
				System.out.println("NOTA INVÁLIDA, vamos para a proxima nota...");
				System.out.println();
			}
		}
		
		double media = total / cont;
		
		if (media >= 7) {
			System.out.printf("O Aluno foi APROVADO com média %.2f%n",media);
		}else if (media < 7 && media > 4) {
			System.out.printf("O Aluno foi para RECUPERAÇÃO com média %.2f%n",media);
		}else {
			System.out.printf("O Aluno foi para REPROVADO com média %.2f%n",media);
		}
		
		sc.close();
	}

}
