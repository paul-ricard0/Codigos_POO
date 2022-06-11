package atividades.pratica03.ex01;

public class Camarote extends Ingresso{
	
	private String localCamarote;
	private double valorAdicional;
	
	public Camarote(double valor, double valorAdicional, String localCamarote) {
		super(valor);
		this.localCamarote=localCamarote;
		this.valorAdicional=valorAdicional;
	}
	
	public String valorCamarote() {
		return "Ingresso Camarote: "+getIngresso()+this.valorAdicional + "\nLocal Camarote: "+localCamarote;
	}
	
}
