package atividades.pratica03.ex02;

public class FPadrao extends Funcionario {
	
	FPadrao(int matricula, String nome, double salario){
		super(matricula, nome, salario);
	}
	
	public double calcularProventos() {
		return getSalario();
	}
	
	
}
