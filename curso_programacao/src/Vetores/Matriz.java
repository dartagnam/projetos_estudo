package Vetores;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Identificando o maior elemento da matriz: ");
		System.out.println("Digite quantas linhas: ");
		int l = sc.nextInt();
		System.out.println("Digite quantas colunas: ");
		int c = sc.nextInt();
		
		int[][] matriz = new int [l][c];
		int maior = 0;
		
		System.out.println("Vamos acrescentar valores a matriz: ");
		
		for(int i = 0; i < l ; i++) {
			System.out.println("Digite os valores da " + (i+1) + "ª linha: ");
			for(int j = 0; j < c; j++) {
				matriz[i][j]= sc.nextInt();
			}
		}
		
		for(int i = 0; i < l ; i++) {
			for(int j = 0; j < c; j++) {
				if(matriz[i][j] > maior);
					maior = matriz[i][j];
			}
		}
		
		System.out.println("O maior elemento é : " + maior);
		
		sc.close();

	}

}
