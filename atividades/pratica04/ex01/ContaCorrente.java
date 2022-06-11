package atividades.pratica04.ex01;

public class ContaCorrente {
	private double saldo;
	
	private double taxaOperacao = 0.45;
	
	public void depositar(double valor) {
		this.saldo += valor - taxaOperacao;
	}
	
	public void sacar (double valor) {
		this.saldo -= valor + taxaOperacao;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	
}
