package atividades.pratica06.ex01;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) throws  IOException{
		
		int key=0;
		
		do {
			
			try {
				
				key = Integer.parseInt(JOptionPane.showInputDialog(null, 
						"<1> Pesquisar Livro\r\n"
						+ "<2> Pesquisar Cliente\r\n"
						+ "<3> Pesquisar os Pedidos de um Cliente\r\n"
						+ "<4> Sair"));
				
				switch (key) {
					case 1: {
						
						break;
					}
					case 2: {
						
						break;
					}
					case 3: {
						
						break;
					}
					case 4: {
							JOptionPane.showMessageDialog(null, "Volte sempre!!  :)");
						break;
					}
					default:
						throw new IllegalArgumentException("Unexpected value: " + key);
				}
			
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}while(key != 4);
		
		
	}
}
