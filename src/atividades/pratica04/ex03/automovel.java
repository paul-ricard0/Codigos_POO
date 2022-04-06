package atividades.pratica04.ex03;

public class automovel {
	private String abs;
	private String airBag;
	private String alarme;
	private String som;
	private String conjuntoEletico;
	private String computadorBordo;
	private double precoBase;
	private double precoFinal;
	
	automovel(double precobase, String abs, String airBag, String alarme, String som, String conjuntoElerico, String computadorBordo){
		setAbs(abs);
		setAirBag(airBag);
		setAlarme(alarme);
		setSom(som);
		setConjuntoEletico(conjuntoElerico);
		setComputadorBordo(computadorBordo);
		this.precoBase = precoBase;
	}
	
	
	
	public double getprecoFinal() {
		return precoFinal;
	}

	
	public String getAbs() {
		return abs;
	}

	public void setAbs(String abs) {
		if(abs != null) {
			this.abs = abs;
			this.precoFinal += this.precoBase * 0.15;
		}
		
	}

	public String getAirBag() {
		return airBag;
	}

	public void setAirBag(String airBag) {
		if(airBag != null) {
			this.airBag = airBag;
			this.precoFinal += this.precoBase * 0.1;
		}
	}

	public String getAlarme() {
		return alarme;
	}

	public void setAlarme(String alarme) {
		if(alarme != null) {
			this.alarme = alarme;
			this.precoFinal += this.precoBase * 0.03;
		}
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		if(som != null) {
			this.som = som;	
			this.precoFinal += this.precoBase * 0.02;
		}
	}

	public String getConjuntoEletico() {
		return conjuntoEletico;
	}

	public void setConjuntoEletico(String conjuntoEletrico) {
		if(conjuntoEletrico != null) {
			this.conjuntoEletico = conjuntoEletico;	
			this.precoFinal += this.precoBase * 0.05;
		}
	}

	public String getComputadorBordo() {
		return computadorBordo;
	}

	public void setComputadorBordo(String computadorBordo) {
		if(computadorBordo!= null) {
			this.computadorBordo = computadorBordo;
			this.precoFinal += this.precoBase * 0.1;
		}
	}

	public double getPrecoBase() {
		return precoBase;
	}

	public void setPrecoBase(double precoBase) {
		this.precoBase = precoBase;
	}
	

}
