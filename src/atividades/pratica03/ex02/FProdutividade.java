package atividades.pratica03.ex02;

public class FProdutividade extends Funcionario {
	
	private double valor;
	private int producao;
	
	FProdutividade(int matricula, String nome, double salario, double valor, int producao){
		super(matricula, nome, salario);
		this.producao = producao;
		this.valor = valor;
	}
	
	public double calcularProventos() {
		return 2;
	}
}
