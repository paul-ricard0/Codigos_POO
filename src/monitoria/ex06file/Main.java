package monitoria.ex06file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class Main {
	
	public static void main(String[] args) throws IOException {
		
		int key=0;
		Path newArq=null;
		do {
			try {
				key = Integer.parseInt(JOptionPane.showInputDialog(null, 
						"<1> Definir caminho e nome de Arquivo TXT para gravação\r\n"
						+ "<2> Cadastrar Projeto\r\n"
						+ "<3> Abrir Arquivo do Projeto\r\n"
						+ "<4> Sair"));
				
				switch (key) {
					case 1: {
						newArq = Tools.Inicializador();
						JOptionPane.showMessageDialog(null, "Cadastro definido com sucesso! ");
							
						break;
					}	
					case 2: {
						Tools.escritor(newArq.toString());
						JOptionPane.showMessageDialog(null, "Cadastro definido com sucesso! ");
						break;
					}
					case 3: {
						Tools.leitor(newArq.toString());
						break;
					}
					case 4: {
						JOptionPane.showMessageDialog(null, "Volte sempre!!  :)");
						break;
					}
					default:
						JOptionPane.showMessageDialog(null,"Unexpected value: " + key);
				}
			
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,e.getMessage());
			}
		}while(key != 4);
		

		

			//Me explica isso aqui direito michelle
			// PQ eu crio isso se eu vou transormar em String depois???????
//			Path caminho = Paths.get("C:", "Jogos-nao-Steam"); //abrindo as pastas
//			Path newArq = caminho.resolve("AulaLP.txt"); //abrir 
//			
//			System.out.println(newArq);//conferir se está certo
//			
//			
//			BufferedWriter escritor = new BufferedWriter(new FileWriter(newArq.toString())); //Chamando o Escritor
//			
//			String linha = "";
//			Scanner scan = new Scanner(System.in);
//			
//			System.out.println("Escreva na 1 linha: ");
//			linha = scan.nextLine();
//			escritor.append(linha + "\n");
//			
//			System.out.println("Escreva na 2 linha: ");
//			linha = scan.nextLine();
//			escritor.append(linha + "\n");
//			
//			System.out.println("TXT Criado com sucesso");
//			
//			escritor.close();
//			scan.close();

		
//		ArrayList<ProjetoSocial> array = new ArrayList();
//		
//		
//		ProjetoSocial rendaBasica = new ProjetoSocial();
//		
//		array.add(rendaBasica);
		
		
		/*
		//01	
		Path newcaminho = Paths.get("C:", "Jogos-nao-Steam"); //abrindo as pastas
		Path newArquivo = newcaminho.resolve("RendaBasica.txt"); //abrir 
		
		System.out.println(newArquivo);//conferir se está certo
		
		
		BufferedWriter escritor = new BufferedWriter(new FileWriter(newArquivo.toString())); //Chamando o Escritor
		
		
		String titulo = JOptionPane.showInputDialog("Titulo: ");
		String objetivo = JOptionPane.showInputDialog("obejetivo: ");
		String endereco = JOptionPane.showInputDialog("endereço: ");
		String dataInicio = JOptionPane.showInputDialog("data inicio: ");
		String status = JOptionPane.showInputDialog("Status: ");
		
		escritor.append("\n"+ titulo +" | "+ objetivo +" | "+ endereco +" | "+ dataInicio +" | "+ status);
		escritor.newLine();
		
		
		
		escritor.close();
		
		
		//03
		BufferedReader leitor = new BufferedReader(new FileReader(newArquivo.toString()));
		String linha = "";
		while (true) {
			if (linha != null) {
				System.out.println(linha);

			} else
				break;
			linha = leitor.readLine();
		}
		leitor.close();
		
		//04
		
		
		*/
		
		
		
		
		
		
		
	}
}