package atividades.pratica02.ex02;

public class Redimentos {
	
	private double invInicial;
	private double txRendimento;
	private double numMes;
	
	public Redimentos(double invInicial, double txRendimento, double numMes) {
		this.invInicial = invInicial;
		this.txRendimento = txRendimento;
		this.numMes = numMes;
	}
	
	public String rendimentoTotal() {
		double xx = this.invInicial * (this.txRendimento * this.numMes);
		return "Rendimento total: " + xx;
	}
	
	
}
