package atividades.pratica05.ex01;

public class Funcionario {
	
	private String nome;
	private String departamento;
	private double salario;
	private String dataEntrada;
	private String RG;
	private boolean p;
	
	public Funcionario(String nome, String departamento, double salario, String dataEntrada, String rG, boolean p) {
		this.nome = nome;
		this.departamento = departamento;
		this.salario = salario;
		this.dataEntrada = dataEntrada;
		RG = rG;
		this.p = p;
	}
	

	public Funcionario(String nome, String departamento, double salario, String rG) {
		this.nome = nome;
		this.departamento = departamento;
		this.salario = salario;
		this.RG = rG;
		this.p = true;
	}

	public Funcionario(String nome, String rG) {
		this.nome = nome;
		this.RG = rG;
	}

	public Funcionario() {
		
	}


	public void bonificar(Double bonus) {
		this.salario += bonus;
	}
	
	public void demitir() {
		this.p = false;
	}
	
	public String mostrarDados() {
		return this.nome +" "+ this.departamento +" "+  this.salario +" "+ this.dataEntrada +" "+ this.RG +" "+ this.p;
	}
	
	
}
