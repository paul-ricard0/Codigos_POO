package atividades.pratica04.ex03;

public class automovel {
	private boolean abs;
	private boolean airBag;
	private boolean alarme;
	private boolean som;
	private boolean conjuntoEletico;
	private boolean computadorBordo;
	private double precoBase;
	private double precoFinal;
	
	automovel(double precobase, boolean abs, boolean airBag, boolean alarme, boolean som, boolean conjuntoElerico, boolean computadorBordo){
		setAbs(abs);
		setAirBag(airBag);
		setAlarme(alarme);
		setSom(som);
		setConjuntoEletico(conjuntoElerico);
		setComputadorBordo(computadorBordo);
		this.precoBase = precobase;
	}

	public boolean isAbs() {
		return abs;
	}

	public void setAbs(boolean abs) {
		this.abs = abs;
		
	}

	public boolean isAirBag() {
		return airBag;
	}

	public void setAirBag(boolean airBag) {
		this.airBag = airBag;
	}

	public boolean isAlarme() {
		return alarme;
	}

	public void setAlarme(boolean alarme) {
		this.alarme = alarme;
	}

	public boolean isSom() {
		return som;
	}

	public void setSom(boolean som) {
		this.som = som;
	}

	public boolean isConjuntoEletico() {
		return conjuntoEletico;
	}

	public void setConjuntoEletico(boolean conjuntoEletico) {
		this.conjuntoEletico = conjuntoEletico;
	}

	public boolean isComputadorBordo() {
		return computadorBordo;
	}

	public void setComputadorBordo(boolean computadorBordo) {
		this.computadorBordo = computadorBordo;
	}

	public double getPrecoBase() {
		return precoBase;
	}

	public void setPrecoBase(double precoBase) {
		this.precoBase = precoBase;
	}

	public double getPrecoFinal() {
		return precoFinal;
	}

	public void setPrecoFinal(double precoFinal) {
		this.precoFinal = precoFinal;
	}
	
	
//	public double getprecoFinal() {
//		return precoFinal;
//	}
//
//	
//	public boolean getAbs() {
//		return abs;
//	}
//
//	public void setAbs(boolean abs) {
//		if(abs) {
//			this.abs = abs;
//			this.precoFinal += this.precoBase * 0.15;
//		}
//		
//	}
//
//	public boolean getAirBag() {
//		return airBag;
//	}
//
//	public void setAirBag(boolean airBag) {
//		if(airBag ){
//			this.airBag = airBag;
//			this.precoFinal += this.precoBase * 0.1;
//		}
//	}
//
//	public boolean getAlarme() {
//		return alarme;
//	}
//
//	public void setAlarme(boolean alarme) {
//		if(alarme) {
//			this.alarme = alarme;
//			this.precoFinal += this.precoBase * 0.03;
//		}
//	}
//
//	public boolean getSom() {
//		return som;
//	}
//
//	public void setSom(boolean som) {
//		if(som) {
//			this.som = som;	
//			this.precoFinal += this.precoBase * 0.02;
//		}
//	}
//
//	public boolean getConjuntoEletico() {
//		return conjuntoEletico;
//	}
//
//	public void setConjuntoEletico(boolean conjuntoEletrico) {
//		if(conjuntoEletrico) {
//			this.conjuntoEletico = conjuntoEletrico;	
//			this.precoFinal += this.precoBase * 0.05;
//		}
//	}
//
//	public boolean getComputadorBordo() {
//		return computadorBordo;
//	}
//
//	public void setComputadorBordo(boolean computadorBordo) {
//		if(computadorBordo) {
//			this.computadorBordo = computadorBordo;
//			this.precoFinal += this.precoBase * 0.1;
//		}
//	}
//
//	public double getPrecoBase() {
//		return precoBase;
//	}
//
//	public void setPrecoBase(double precoBase) {
//		this.precoBase = precoBase;
//	}
//	

}
