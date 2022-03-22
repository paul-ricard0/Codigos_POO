package atividades.pratica02.ex02;

public class Redimentos {
	
	private double invI;
	private double txRendimento;
	private double numMes;
	
	public Redimentos(double invI, double txRendimento, double numMes) {
		this.invI = invI;
		this.txRendimento = txRendimento/100;
		this.numMes = numMes;
	}
	
	
	
	public double rendimento() {
		double invf = this.invI;
		double adendo= 0;
		
		for(int i=0; this.numMes != i; i++) {
						
			adendo = invf * txRendimento;
			invf = invf + adendo;
			System.out.printf("%,.2f",invf);
			System.out.println();
		}
		
		return invf;
	}
	
	

	
}
