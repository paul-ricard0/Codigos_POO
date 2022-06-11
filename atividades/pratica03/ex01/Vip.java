package atividades.pratica03.ex01;

public class Vip extends Ingresso{
	
	private double valorAdicional;
	
	public Vip (double valor, double valorAdicional) {
		super(valor);
		this.valorAdicional = valorAdicional;
		
	}
	
	public String valorVip() {
		return "Ingresso VIP " + getIngresso()+this.valorAdicional;
	}
}
