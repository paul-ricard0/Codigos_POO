package monitoria.prova.pc2.tipo1;

import java.util.Scanner;

/*
 * Escreva um programa em Java que calcule o valor do Imposto de Renda Mensal para
 * os contribuintes Pessoa F�sica e Pessoa Jur�dica. Seguir as regras abaixo: (10 pontos)
 * � O programa dever� solicitar os seguintes dados: Nome, Renda Bruta e tipo de
 * contribuinte (1- Pessoa F�sica e 2- Jur�dica ).
 * � O c�lculo do IR mensal para a Pessoa Jur�dica � 10% sobre o valor da Renda Bruta.
 * � O c�lculo do IR mensal para a Pessoa F�sica � dado pela seguinte tabela:
 * Ao final dever� mostrar o valor a ser pago (IR Mensal) para cada tipo de contribuinte.
*/

public class Q3_imposto {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("Nome: ");
//		String nome = scan.nextLine();
		
		System.out.print("\nPessoa F�sica[1] Pessoa Jur�dica[2}: ");
		int tipo = scan.nextInt();
		
		System.out.print("\nRenda: ");
		double renda = scan.nextFloat();
		scan.close();
		
		switch (tipo) {
			case 1: {
				System.out.print("\nValor a ser pago: "+ (renda * 0.1));
				System.out.print("\nValor renda l�quida: "+ (renda * 0.9));
				break;
			}
			case 2: {
				if(renda<1903.98) {
					System.out.print("\nValor a ser pago: 0");
					System.out.print("\nValor renda l�quida: "+ renda);
				}else if(renda<2826.65) {
					System.out.print("\nValor a ser pago: 142.80");
					System.out.print("\nValor renda l�quida: "+ (renda * 142.80));
				}else if(renda<3751.05) {
					System.out.print("\nValor a ser pago: 354.80");
					System.out.print("\nValor renda l�quida: "+ (renda * 354.80));
				}else if(renda<4664.68) {
					System.out.print("\nValor a ser pago: 636.13");
					System.out.print("\nValor renda l�quida: "+ (renda * 636.13));
				}else{
					System.out.print("\nValor a ser pago: 869.36");
					System.out.print("\nValor renda l�quida: "+ (renda * 869.36));
				}
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + tipo);
		}
		
	}
	
}
