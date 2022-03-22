package atividades.pratica03.ex02;

public class FComissionado extends Funcionario{
	
	private double percentual;
	private double vendas;
	
	FComissionado(int matricula, String nome, double salario, double percentual, double vendas){
		super(matricula, nome, salario);
		this.percentual = percentual;
		this.vendas = vendas;
	}
	
	public double calcularProventos() {
		return 2;
	}
	
	falta set e get
}
