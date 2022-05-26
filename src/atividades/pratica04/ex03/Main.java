package atividades.pratica04.ex03;

import javax.swing.JOptionPane;

/*	Criar uma classe com o nome automóvel com os atributos lógicos: abs, airBag, alarme, 
	som, conjunto elétrico e computador de bordo. Também, deverá ser criado o atributo 
	preço base do automóvel sem estes opcionais. Baseado nisto, a classe receberá os 
	seguintes métodos: 
	a) construtor: receber os atributos definidos;
	b) métodos set e get: para todos os atributos inseridos;
	c) método calcularPrecoFinal: informa o preço do carro baseado nas seguintes regras:

	Criar uma classe chamada popular que herda automóvel, a qual receberá como 
	parâmetro um percentual de desconto. Criar um método calcularPrecoFinalPopular que 
	vai ser responsável por imprimir o preço final com o desconto.
	Main: criar uma entrada para no máximo 100 automóveis. Solicitar ao usuário a escolha:
	<1> Cadastro Carro Popular
	<2> Calcular Preço
	<3> Sair*/

public class Main {

	public static void main(String[] args) {
		
		popular[] carros = new popular[100];
		int cont = 0;
		do{
		
			String  op = JOptionPane.showInputDialog("(1) Cadastro Carro Popular \n(2) Calcular Preço \n(3) Sair");
			
			switch (op) {
				case "1":
					
					int PB = Integer.parseInt( JOptionPane.showInputDialog("Qual o preço base? "));
					boolean ABS = Boolean.parseBoolean( JOptionPane.showInputDialog("Quer abs? \n Sim (1) \n Não (0)"));
					boolean AB = Boolean.parseBoolean( JOptionPane.showInputDialog("Quer airbag? \n Sim (1) \n Não (0)"));
					boolean AL = Boolean.parseBoolean( JOptionPane.showInputDialog("Quer alarme? \n Sim (1) \n Não (0)"));
					boolean SOM = Boolean.parseBoolean( JOptionPane.showInputDialog("Quer som? \n Sim (1) \n Não (0)"));
					boolean CE = Boolean.parseBoolean( JOptionPane.showInputDialog("Quer conjunto Eletrico? \n Sim (1) \n Não (0)"));
					boolean CB = Boolean.parseBoolean( JOptionPane.showInputDialog("Quer computador Bordo? \n Sim (1) \n Não (0)"));
					
					carros[cont] = new popular(PB, ABS, AB, AL, SOM, CE, CB);
					
					cont++;
					break;
				case "2":
					
					JOptionPane.showMessageDialog(null, "Preço final: "+ carros[cont - 1].calcularPrecoFinalPopular());
					
					break;
				case "3":
					JOptionPane.showMessageDialog(null, "Vlwwww!!!");
					cont = 1000;
					break;
				default:
					JOptionPane.showMessageDialog(null, "Resposta Invalída");
			}
			
			
		}while(cont != 1000);
	}

}
