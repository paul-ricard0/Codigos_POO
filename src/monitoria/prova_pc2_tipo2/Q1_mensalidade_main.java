package monitoria.prova_pc2_tipo2;

import java.util.Scanner;

public class Q1_mensalidade_main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Qual o valor da mensalidade? ");
		double mensalidade = scan.nextDouble();
		
		System.out.println("Quantidade de irmão? ");
		int qtd_irmao = scan.nextInt();
		scan.close();
		
		Q1_mensalidade matricula = new Q1_mensalidade(mensalidade, qtd_irmao);
		
		matricula.calculaMensalidade();
		System.out.println("Valor da mensalidade: "+ matricula.getMensalidade());
	}


}
