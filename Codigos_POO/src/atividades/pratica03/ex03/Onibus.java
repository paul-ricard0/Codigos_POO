package atividades.pratica03.ex03;

import javax.swing.JOptionPane;

public class Onibus extends Veiculo {
	
	private int assentos;
	
	Onibus(String placa,int ano, int assentos){
		super(placa, ano);
		this.assentos = assentos;
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	
	public String exibirDados() {
		return "Dados do veiculo: \n \nPlaca: "+ getPlaca() + "\nAno: "+ getAno() +"\nAssentos: "+this.assentos;
	}
	

}
