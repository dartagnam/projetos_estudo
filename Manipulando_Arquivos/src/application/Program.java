package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Produto> lista = new ArrayList<>();
		
		System.out.print("Entre com o caminho do arquivo: ");
		String sourceFileStr = sc.nextLine();
		
		//guardando caminho do arquivo
		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
		//criando pasta
		boolean success = new File(sourceFolderStr + "\\out").mkdir();
		
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
			String itemCsv = br.readLine();
			while(itemCsv != null) {
				String[] fields = itemCsv.split(",");
				String nome = fields[0];
				double preco = Double.parseDouble(fields[1]);
				int quantidade = Integer.parseInt(fields[2]);
				
				lista.add(new Produto(nome, preco, quantidade));
				
				itemCsv = br.readLine();
			}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
				for(Produto item: lista) {
					bw.write(item.getNome() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}
				
				System.out.println(targetFileStr + " CRIADO!");
				
			}
			catch(IOException e) {
				System.out.println("Erro ao gravar arquivo: " + e.getMessage());
			}
		}
		catch(IOException e) {
			System.out.println("Erro ao gravar arquivo: " + e.getMessage());
		}
		
		sc.close();
	}

}
