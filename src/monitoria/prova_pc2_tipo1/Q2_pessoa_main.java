package monitoria.prova_pc2_tipo1;


/*
 * Criar um Projeto chamado Cadastro e uma Classe com o nome Pessoa.
 * A classe Pessoa deve conter os seguintes atributos: (10 pontos)
 * Nome do Atributo Tipo Acesso
 * Nome String Privado
 * Sobrenome String Privado
 * Para acessar os atributos crie os métodos seterst e geterst para cada um deles. A criação do
 * construtor é opcional.
 * A classe Pessoa ainda deve ter o seguinte método:
 * Assinatura Void ImprimeNomeCompleto()
 */

public class Q2_pessoa_main {

	public static void main(String[] args) {

		Q2_pessoa pessoa = new Q2_pessoa("Leonardo", "Messias");
		
		pessoa.assinatura();
	}

}
