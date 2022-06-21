package prova.av2.ex1;

import javax.swing.JOptionPane;



public class Main {
	
	public static void main(String[] args) {
		
		String dataCriacao = JOptionPane.showInputDialog("Data Criacao: ");
		String nomeUsuario= JOptionPane.showInputDialog("Nome usuario");
		String dataNascimento = JOptionPane.showInputDialog("Data Nascimento ");
		String senha = JOptionPane.showInputDialog("Senha ");
		
		RedeSocial rede = new RedeSocial(dataCriacao, nomeUsuario, dataNascimento, senha);
		
		String dataPublicacao= JOptionPane.showInputDialog("Data Publicao ");
		String textoPublicacao = JOptionPane.showInputDialog("texto Publicao ");
		String linkMidia = JOptionPane.showInputDialog("Link Midia ");
		
		Publicacao publi01 = new Publicacao(dataPublicacao, textoPublicacao, linkMidia);
		rede.inserePublicacao(publi01);
		
		dataPublicacao= JOptionPane.showInputDialog("Data Publicao 2");
		textoPublicacao = JOptionPane.showInputDialog("texto Publicao  ");
		linkMidia = JOptionPane.showInputDialog("Link Midia ");
		
		Publicacao publi02 = new Publicacao(dataPublicacao, textoPublicacao, linkMidia);
		rede.inserePublicacao(publi02);
		
		rede.imprimePublicacao();
		
		
	}
}
