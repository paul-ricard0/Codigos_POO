package prova.av2.ex1;

import java.util.ArrayList;

import atividades.pratica05.ex01.Funcionario;

public class RedeSocial {
	
	private String dataCriacao;
	private String nomeusuario;
	private String dataNascimento;
	private String senha;
	
	
	public RedeSocial(String dataCriacao, String nomeusuario, String dataNascimento, String senha) {
		super();
		this.dataCriacao = dataCriacao;
		this.nomeusuario = nomeusuario;
		this.dataNascimento = dataNascimento;
		this.senha = senha;
	}
	
	ArrayList<Publicacao> publicacoes = new ArrayList<> ();
	
	public void inserePublicacao(Publicacao publi) {
		publicacoes.add(publi);
	}
	
	public void imprimePublicacao() {
		System.out.println("Cotador "+ Publicacao.getContadorPublicacao());
		
		for(int i = 0;i<publicacoes.size();i++){  
		     System.out.println("texto: "+publicacoes.get(i).getTextoPublicacao() +"   "+ "Data: "+ publicacoes.get(i).getDataPublicacao() +"   "+ "Link: "+publicacoes.get(i).getLinkMidia());  
		}
		
	}
}
