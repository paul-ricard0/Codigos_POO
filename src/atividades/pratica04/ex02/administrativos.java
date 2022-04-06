package atividades.pratica04.ex02;

public class administrativos extends funcionario {
	
	private double horasExtra;
	
	public double salarioTotal() {
		double salario = getSalarioBase() + ( horasExtra * (this.getSalarioBase()/100));
		horasExtra=0;
		return salario;
	}
	
}
