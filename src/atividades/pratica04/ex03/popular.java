package atividades.pratica04.ex03;

public class popular extends automovel{
	
	popular(double precobase, boolean abs, boolean airBag, boolean alarme, boolean som, 
			boolean conjuntoEletrico, boolean computadorBordo){
		
		super(precobase, abs, airBag, alarme, som, conjuntoEletrico, computadorBordo);
		
	}
	
	
	
	public double calcularPrecoFinalPopular() {
		
		setPrecoFinal(getPrecoBase());
		
		if(isAbs()) {
			setPrecoFinal(getPrecoFinal() + (getPrecoBase() * 0.15));
		}
		
		if(isAirBag()) {
			setPrecoFinal(getPrecoFinal() + (getPrecoBase() * 0.1));
		}
		
		if(isAlarme()) {
			setPrecoFinal(getPrecoFinal() + (getPrecoBase() * 0.03));
		}
		
		if(isSom()) {
			setPrecoFinal(getPrecoFinal() + (getPrecoBase() * 0.02));
		}
		
		if(isConjuntoEletico()) {
			setPrecoFinal(getPrecoFinal() + (getPrecoBase() * 0.05));
		}
		
		if(isComputadorBordo()) {
			setPrecoFinal(getPrecoFinal() + (getPrecoBase() * 0.1));
		}

		return getPrecoFinal();
	}
}
