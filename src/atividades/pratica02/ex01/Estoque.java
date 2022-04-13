package atividades.pratica02.ex01;

public class Estoque {
	private String nome;
	private int qtdAtual;
	private int qtdMinima;
	
	public Estoque(String nome, int qtdAtual, int qtdMinima) {
		this.nome = nome;
		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
	}
	
	public Estoque() {}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private void setQtdAtual(int qtdAtual) {
		this.qtdAtual = qtdAtual;
	}

	private void setQtdMinima(int qtdMinima) {
		this.qtdMinima = qtdMinima;
	}

	public String getNome() {
		return nome;
	}

	public int getQtdAtual() {
		return qtdAtual;
	}

	public int getQtdMinima() {
		return qtdMinima;
	}
	
	public void darBaixa(int qtde) {
		if(qtde>0) {
			this.qtdAtual = qtde;
			System.out.println("Quantidade atualizada");
		}else {
			System.out.println("Quantidade NEGATIVA!!!!");
		}
	}
	public String mostra() {
		
		return "\n \nNome produto: " +this.nome+ "\nQuantidade atual: " +this.qtdAtual+ "\nQuantidade mínima " +this.qtdMinima+ "\n \n";
	}
	public boolean precisaRepor() {
		return this.qtdAtual <= this.qtdMinima ? true : false;
	}
	
	
	
}
