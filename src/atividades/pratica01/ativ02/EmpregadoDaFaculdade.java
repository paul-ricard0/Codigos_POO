package atividades.pratica01.ativ02;

public class  EmpregadoDaFaculdade{
	private String nome;
	private double salario;
	private int horasAula;
	
	double getGastos(){
		return this.salario;
	}
	String getInfo(){
		return "nome:" + this.nome + " com salário " + this.salario;
	}
}
