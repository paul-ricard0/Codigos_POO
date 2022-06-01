package monitoria.prova.pc2.tipo2;

import java.util.Scanner;

/*
 * Criar um Projeto chamado Cadastro e uma Classe com o nome Pessoa.
 * A classe Pessoa deve conter os seguintes atributos: (10 pontos)
 * Nome do Atributo Tipo Acesso
 * nome String Privado
 * sobrenome String Privado
 * idade int Privado
 * telefone String Privado
 * Para acessar os atributos crie os métodos seterst e geterst para cada um deles. A criação do
 * construtor é opcional.
 */

public class Q2_pessoa_main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Qual seu nome? ");
		String nome = scan.nextLine();

		System.out.println("Qual seu sobrenome? ");
		String sobrenome = scan.nextLine();
		scan.close();
		Q2_pessoa pessoa = new Q2_pessoa(nome, sobrenome);
		
		pessoa.assinatura();
		
	}

}
