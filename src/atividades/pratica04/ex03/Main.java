package atividades.pratica04.ex03;

import javax.swing.JOptionPane;



public class Main {

	public static void main(String[] args) {
		
		popular[] carros = new popular[100];
		int cont = 0;
		do{
		
			String  op = JOptionPane.showInputDialog("(1) Cadastro Carro Popular \n(2) Calcular Pre�o \n(3) Sair");
			
			switch (op) {
				case "1":
					
					int PB = Integer.parseInt( JOptionPane.showInputDialog("Qual o pre�o base? "));
					boolean ABS = Boolean.parseBoolean( JOptionPane.showInputDialog("Quer abs? \n Sim (1) \n N�o (0)"));
					boolean AB = Boolean.parseBoolean( JOptionPane.showInputDialog("Quer airbag? \n Sim (1) \n N�o (0)"));
					boolean AL = Boolean.parseBoolean( JOptionPane.showInputDialog("Quer alarme? \n Sim (1) \n N�o (0)"));
					boolean SOM = Boolean.parseBoolean( JOptionPane.showInputDialog("Quer som? \n Sim (1) \n N�o (0)"));
					boolean CE = Boolean.parseBoolean( JOptionPane.showInputDialog("Quer conjunto Eletrico? \n Sim (1) \n N�o (0)"));
					boolean CB = Boolean.parseBoolean( JOptionPane.showInputDialog("Quer computador Bordo? \n Sim (1) \n N�o (0)"));
					
					carros[cont] = new popular(PB, ABS, AB, AL, SOM, CE, CB);
					
					cont++;
					break;
				case "2":
					
					JOptionPane.showMessageDialog(null, "Pre�o final: "+ carros[cont - 1].calcularPrecoFinalPopular());
					
					break;
				case "3":
					JOptionPane.showMessageDialog(null, "Vlwwww!!!");
					cont = 1000;
					break;
				default:
					JOptionPane.showMessageDialog(null, "Resposta Inval�da");
			}
			
			
		}while(cont != 1000);
	}

}
