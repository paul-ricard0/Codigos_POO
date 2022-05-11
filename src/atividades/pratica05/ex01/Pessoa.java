package atividades.pratica05.ex01;

public class Pessoa {
	
	private String nome;
	private double altura;
	private double peso;
	private int idade;
	
	public Pessoa(String nome, double altura, double peso, int idade) {
		
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
		this.idade = idade;
	}
	
	public String getInfo() {
		return this.nome + " " + this.altura + " " + this.peso ;
	}
	
	public void niver() {
		this.idade += 1;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
}
