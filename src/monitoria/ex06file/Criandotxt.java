package monitoria.ex06file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Criandotxt {
	
	public static void main(String[] args) throws IOException {
		
		try {
			Path caminho = Paths.get("C:", "Jogos-nao-Steam"); //abrindo as pastas
			Path newArq = caminho.resolve("AulaLP.txt"); //abrir 
			
			System.out.println(newArq);//conferir se está certo
			
			
			BufferedWriter escritor = new BufferedWriter(new FileWriter(newArq.toString())); //Chamando o Escritor
			
			String linha = "";
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Escreva na 1 linha: ");
			linha = scan.nextLine();
			escritor.append(linha + "\n");
			
			System.out.println("Escreva na 2 linha: ");
			linha = scan.nextLine();
			escritor.append(linha + "\n");
			
			System.out.println("TXT Criado com sucesso");
			
			escritor.close();
			scan.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
