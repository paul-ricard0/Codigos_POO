package monitoria.pc1.B;

import java.util.Scanner;

/*
 * Escreva um algoritmo que calcule a quantidade de dinheiro
 * gasto por um fumante ao longo de sua vida. O programa dever� solicitar o n�mero de
 * anos que a pessoa fuma, o n�mero de cigarros fumados por dia e o pre�o de uma
 * carteira de cigarros. Ao final mostrar o valor gasto.
 */
public class Q2_cigarros {

	public static void main(String[] args) {
		int anos, qtd_cigarros;
		double preco, valor_total;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("A quantos anos voc� fuma? ");
		anos = scan.nextInt();  
		
		System.out.println("Quantos CIGARROS voc� fuma por dia? ");
		qtd_cigarros = scan.nextInt();  
		
		System.out.println("Quanto CUSTA a carteira de cigarros? ");
		preco = scan.nextDouble();  
		scan.close();
		
		qtd_cigarros = qtd_cigarros * (365*anos);
		
		valor_total = qtd_cigarros/20 * preco;
		
		System.out.println("Total gasto: "+ valor_total);

	}

}
