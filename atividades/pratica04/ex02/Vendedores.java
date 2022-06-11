package atividades.pratica04.ex02;

public class Vendedores extends funcionario{
	
	private double comissao;
	private int totalVendas;
	private double totalValor;
	
	public void novaVenda(double valor, int qtdVenda) {
		this.totalVendas += qtdVenda;
		this.totalValor += valor;
	}
	
	public double salarioTotal() {
		double salario = getSalarioBase() + (totalValor * 0.05);
		totalVendas=0;
		totalValor=0;
		return salario;
	}
	
}
