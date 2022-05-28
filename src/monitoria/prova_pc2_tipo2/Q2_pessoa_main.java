package monitoria.prova_pc2_tipo2;

import java.util.Scanner;

public class Q2_pessoa_main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Qual seu nome? ");
		String nome = scan.nextLine();

		System.out.println("Qual seu sobrenome? ");
		String sobrenome = scan.nextLine();
		
		Q2_pessoa pessoa = new Q2_pessoa(nome, sobrenome);
		
		pessoa.assinatura();
	}

}
