package atividades.pratica04.ex03;

public class popular extends automovel{
	
	popular(double precobase, String abs, String airBag, String alarme, String som, String conjuntoEletrico, String computadorBordo){
		super(precobase, abs, airBag, alarme, som, conjuntoEletrico, computadorBordo);
	}
	public double calcularPrecoFinalPopular() {
		return getprecoFinal() - (getprecoFinal() * 0.10);
	}
}
