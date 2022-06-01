package monitoria.prova.pc2.tipo1;

import java.util.Scanner;

/*
 * Criar um Projeto chamado CalculaMensalidade. Fazer um programa em Java que
 * leia o valor da mensalidade e o número de irmãos de um aluno e calcule o valor a ser pago com
 * desconto. Utilize classe e objeto. (10 pontos)
 * Orientações:
 * 1- Criar a classe alunoMensalidade que deverá possuir os atributos valor da mensalidade e o
 * número de irmãos. Crie os métodos setters e getters. Também crie um construtor com os dois
 * atributos.
 * Criar um método calculaMensalidade, que deverá apenas executar o ajuste da mensalidade (tipo
 * void), da seguinte forma:
 * Se número de irmãos for igual a 1 → desconto de 5%
 * Se número de irmãos for igual a 2 → desconto de 10%
 * Se número de irmãos for maior que dois-> desconto de 15%
 * Caso o número de irmãos seja 0 → o desconto será zero
*/

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