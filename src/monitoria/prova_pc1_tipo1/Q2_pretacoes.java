package monitoria.prova_pc1_tipo1;

import java.util.Scanner;

/*
 * Uma loja está vendendo seus produtos em até 5 prestações
 * sem juros. Faça um algoritmo que receba o valor de uma compra, o número de
 * prestações (máximo 5) e mostre o valor das parcelas.
 */


public class Q2_pretacoes {

	public static void main(String[] args) {
		
		int qtd_parcelas=0;
		double valor;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual valor da compra? ");
		valor = scan.nextDouble();  
		
		do {
			System.out.println("Quantas parcelas? ");
			qtd_parcelas= scan.nextInt();  
			scan.close();
			
			if(qtd_parcelas<=5) {
				valor= valor/qtd_parcelas;
				
				System.out.println("Cada parcela fica por: "+ valor);
				
			}else {
				System.out.println("O máximo de parcelas é 5!!!");
			}
		}while(qtd_parcelas>5);
	}

}
