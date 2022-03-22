package atividades.pratica03.ex01;

public class Normal extends Ingresso{
	
	
	public Normal(double valor) {
		super(valor);
	}
	
	public String valorNormal() {
		return "Ingresso normal" + getIngresso();
	}
}
