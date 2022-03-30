package atividades.pratica03.ex02;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String tipo = JOptionPane.showInputDialog("(1) Padrao \n(2) Comissionado \n(3) Produtividade");
		
		int matricula  = Integer.parseInt( JOptionPane.showInputDialog("Qual a matricula? "));
		String nome = JOptionPane.showInputDialog("Qual o nome? ");
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do salario? "));
		
		switch(tipo) {
			case "1":
				FPadrao F = new FPadrao(matricula, nome, salario);
				JOptionPane.showMessageDialog(null, "O seu salário total (com proventos) é igual: "+ F.calcularProventos());
				break;
			case "2":
				double percentual = Double.parseDouble(JOptionPane.showInputDialog("Qual o percentual? "));
				double qtdVendas = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade de vendas voce fez? "));
				FComissionado FC = new FComissionado(matricula, nome, salario, percentual, qtdVendas);
				JOptionPane.showMessageDialog(null, "O seu salário total (com proventos) é igual: "+ FC.calcularProventos());
				break;
			case "3":
				double producao = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a sua a produção? "));
				int valor = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor da sua comissão? "));
				FProdutividade FP = new FProdutividade(matricula, nome, salario, producao, valor);
				JOptionPane.showMessageDialog(null, "O seu salário total (com proventos) é igual: "+ FP.calcularProventos());
			default:
				JOptionPane.showMessageDialog(null, "Resposta Invalída");
		}

	}

}

