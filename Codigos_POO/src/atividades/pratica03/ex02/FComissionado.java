package atividades.pratica03.ex02;

public class FComissionado extends Funcionario{
	
	private double percentual;
	private double qtdVendas;
	
	FComissionado(int matricula, String nome, double salario, double percentual, double qtdVendas){
		super(matricula, nome, salario);
		this.percentual = percentual/100;
		this.qtdVendas = qtdVendas;
	}
	
	public double calcularProventos() {
		return getSalario() + (this.percentual * this.qtdVendas);
	}
	
	public double getPercenual() {
		return this.percentual;
	}
	
	public void setPercenual(double percentual) {
		this.percentual = percentual;
	}
	
	public double getVendas() {
		return this.qtdVendas;
	}
	
	public void setVendas(double qtdVendas) {
		this.qtdVendas = qtdVendas;
	}
	
	
	
}
