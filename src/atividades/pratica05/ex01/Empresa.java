package atividades.pratica05.ex01;

public class Empresa {
	
	private String nome;
	private String cnpj;
	private int qtd_func=0;
	
	
	public Empresa(String nome, String cnpj, int qtd_func) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.qtd_func = qtd_func;
	}


	public Empresa(String nome, String cnpj) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.qtd_func =  10;
	}
	
	
	
}
