package atividades.praticaFinal;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws  IOException{
		
		int key=10;
		
		do {
			
			try {
				
				key = Integer.parseInt(JOptionPane.showInputDialog(null, 
						"<1> - Cadastrar os item\r\n"
						+ "<2> - Alterar\r\n"
						+ "<3> - Excluir\r\n"
						+ "<4> - Listar \r\n"
						+ "<5> - Procurar item por título\r\n"
						+ "<0> - Sair"));
				
				switch (key) {
					case 1: {
						
						break;
					}
					case 2: {
						
						key = Integer.parseInt(JOptionPane.showInputDialog(null,
								"O QUE DESEJA ALTERAR???"
								+ "<1> - ID\r\n"
								+ "<2> - LOCAL\r\n"
								+ "<3> - DATA\r\n"
								+ "<4> - TITULO\r\n"
								+ "<5> - OBSERVACAO\r\n"
								+ "<6> - TIPO"));
						
						
						
						break;
					}
					case 3: {
						
						break;
					}
					case 4: {
						do {
							key = Integer.parseInt(JOptionPane.showInputDialog(null, 
									"<1> - Por Data\r\n"
									+ "<2> - Por Status\r\n"));
							
							if(key == 1) {
								key=10;
								
							}else if(key == 2) {
								key=10;
							}else {
								JOptionPane.showMessageDialog(null, "Key inválida: " + key);
							}
							
						}while(key != 10);
						
						break;
					}
					case 5: {
						
						break;
					}
					case 0: {
							JOptionPane.showMessageDialog(null, "Volte sempre!!  :)");
						break;
					}
					default:
						throw new IllegalArgumentException("Unexpected value: " + key);
				}
			
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}while(key != 0);
		
		
	}

}
