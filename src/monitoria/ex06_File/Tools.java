package monitoria.ex06_File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class Tools {
	
	public static Path Inicializador() throws IOException {
		
		String pasta = JOptionPane.showInputDialog(null, "qual a pasta");
		String nome = JOptionPane.showInputDialog(null, "Nome do arquivo? ");
		
		Path caminho = Paths.get("C:", pasta); 
		Path criarArquivo = caminho.resolve(nome+".txt");
		
		return criarArquivo; 
	}
	
	
	public static void escritor(String arquivo) throws IOException {
		BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivo));
		
		String titulo = JOptionPane.showInputDialog("Titulo: ");
		String objetivo = JOptionPane.showInputDialog("objetivo: ");
		String endereco = JOptionPane.showInputDialog("endereço: ");
		String dataInicio = JOptionPane.showInputDialog("data inicio: ");
		String status = JOptionPane.showInputDialog("Status: ");
		
		escritor.append(titulo +" | "+ objetivo +" | "+ endereco +" | "+ dataInicio +" | "+ status);
		
		escritor.close();
	}
	
	public static void leitor(String arquivo) throws IOException {
		BufferedReader leitor = new BufferedReader(new FileReader(arquivo.toString()));
		String linha = "";
		while (true) {
			if (linha != null) {
				JOptionPane.showMessageDialog(null, linha);
			} else
				break;
			linha = leitor.readLine();
		}
		leitor.close();
	}
}
