package atividades.pratica03.ex03;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		String tipo = JOptionPane.showInputDialog("(1) ônibus \n(2) caminhão");
		String placa = JOptionPane.showInputDialog("Qual a placa do veiculo? ");
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano do veiculo? "));
		
		switch(tipo) {
			case "1":
				int assentos = Integer.parseInt(JOptionPane.showInputDialog("Quantos assentos em o ônibus? "));
				Onibus onibus = new Onibus(placa, ano, assentos);
				
				JOptionPane.showMessageDialog(null, onibus.exibirDados());
				
				break;
			case "2":
				int eixos = Integer.parseInt(JOptionPane.showInputDialog("Quantos eixos tem o caminhão?"));
				Caminhao caminhao = new Caminhao(placa, ano, eixos);
				
				 caminhao.exibirDados();
				
				break;
			default:
				JOptionPane.showMessageDialog(null, "Resposta Invalída");
		
		}
		
	}

}
