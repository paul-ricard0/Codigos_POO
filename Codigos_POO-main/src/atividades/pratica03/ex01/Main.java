package atividades.pratica03.ex01;

import javax.swing.JOptionPane;



public class Main {
	
	public static void main(String[] args) {
		
		String tipo = JOptionPane.showInputDialog("(1) Ingresso Normal \n(2) VIP \n(3) Camarote");
		double valor = Double.parseDouble( JOptionPane.showInputDialog("Qual o valor do ingresso? "));
		
		switch (tipo) {
			case "1":
				Normal normal = new Normal(valor);
				JOptionPane.showMessageDialog(null, normal.valorNormal());
				
				break;
			case "2":
				double adVip = Double.parseDouble( JOptionPane.showInputDialog("Qual o valor adicional do vip? "));
				Vip vip = new Vip(valor, adVip);
				
				JOptionPane.showMessageDialog(null, vip.valorVip());
				
				break;
			case "3":
				double adCamarote = Double.parseDouble( JOptionPane.showInputDialog("Qual o valor adicional do camarote? "));
				String local = JOptionPane.showInputDialog("Onde é o camarote? ");
				Camarote camarote = new Camarote(valor, adCamarote, local);
				JOptionPane.showMessageDialog(null, camarote.valorCamarote());
				break;
			default:
				JOptionPane.showMessageDialog(null, "Resposta Invalída");
		}
		
		
		
	}
	

}
