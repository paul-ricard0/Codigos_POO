package atividades.praticaFinal;

import java.io.IOException;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws  IOException{
		
		int key=10;
		GerenciadorBD bd = new GerenciadorBD();
		
		try {
			bd.connect();
			do{
				key = menu();
				switch (key) {
					case 1: {
						bd.cadastrarItem();
						break;
					}
					case 2: {
						key = menuAlterar();
						bd.alterarItem(key);
						break;
					}
					case 3: {
						bd.excluirItem();
						break;
					}
					case 4: {
						bd.listarItem();
						break;
					}
					case 5: {
						bd.procurarItemPorNome();
						break;
					}
					case 0: {
							JOptionPane.showMessageDialog(null, "Volte sempre!!  :)");
						break;
					}
					default:
						throw new IllegalArgumentException("Unexpected value: " + key);
				}
			}while(key != 0);
			bd.closeConn();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int menu() {
		return Integer.parseInt(JOptionPane.showInputDialog(null, "<1> - Cadastrar os item\r\n"
				+ "<2> - Alterar\r\n"
				+ "<3> - Excluir\r\n"
				+ "<4> - Listar itens\r\n"
				+ "<5> - Procurar item por nome\r\n"
				+ "<0> - Sair"));
	}

	public static int menuAlterar() {
		return Integer.parseInt(JOptionPane.showInputDialog(null, "O QUE DESEJA ALTERAR???"
				+ "<1> - ID\r\n"
				+ "<2> - LOCAL\r\n"
				+ "<3> - DATA\r\n"
				+ "<4> - TITULO\r\n"
				+ "<5> - OBSERVACAO\r\n"
				+ "<6> - TIPO"));
	}

}

	
	
	
	