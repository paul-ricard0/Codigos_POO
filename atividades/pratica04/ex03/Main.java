package atividades.pratica04.ex03;

import javax.swing.JOptionPane;

/*	Criar uma classe com o nome autom�vel com os atributos l�gicos: abs, airBag, alarme, 
	som, conjunto el�trico e computador de bordo. Tamb�m, dever� ser criado o atributo 
	pre�o base do autom�vel sem estes opcionais. Baseado nisto, a classe receber� os 
	seguintes m�todos: 
	a) construtor: receber os atributos definidos;
	b) m�todos set e get: para todos os atributos inseridos;
	c) m�todo calcularPrecoFinal: informa o pre�o do carro baseado nas seguintes regras:

	Criar uma classe chamada popular que herda autom�vel, a qual receber� como 
	par�metro um percentual de desconto. Criar um m�todo calcularPrecoFinalPopular que 
	vai ser respons�vel por imprimir o pre�o final com o desconto.
	Main: criar uma entrada para no m�ximo 100 autom�veis. Solicitar ao usu�rio a escolha:
	<1> Cadastro Carro Popular
	<2> Calcular Pre�o
	<3> Sair*/

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
