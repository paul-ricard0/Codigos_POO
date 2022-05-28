package monitoria.prova_pc1_tipo1;

import java.util.Scanner;

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
			
			if(qtd_parcelas<=5) {
				valor= valor/qtd_parcelas;
				
				System.out.println("Cada parcela fica por: "+ valor);
				
			}else {
				System.out.println("O máximo de parcelas é 5!!!");
			}
		}while(qtd_parcelas>5);
	}

}
