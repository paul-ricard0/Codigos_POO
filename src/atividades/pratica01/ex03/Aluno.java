package atividades.pratica01.ex03;

/*
 * Criar uma classe Aluno que possui os atributos: nome, matricula, notaAV1, notaAV2,
 * notaAE, curso, periodo.
 * 
 * a) Criar o construtor desta classe.
 * 
 * b) Criar um método para alterar cada uma das notas. Exemplo: alteraNotaAV1,
 * alteraNotaAV2 e alteraNotaAE.
 * 
 * c) Criar um método para avaliarAluno que deverá receber como parâmetros os valores
 * de notaAV1, notaAV2, e mostrar a seguinte mensagem:
 * Se a soma de notaAV1 e notaAV2 for maior ou igual a 60 pontos, o aluno é Aprovado,
 * caso contrário será Recuperação.
 * 
 * d) Criar um método para avaliarRecuperação que deverá receber como parâmetro os
 * valores de notaAV1, notaAV2 e notaAE. Deverá ser calculado a nota média. Se o valor
 * total for superior ou igual a 60 pontos, o aluno é Aprovado, caso contrário Reprovado.
 * 
 * e) Criar no Void main() um objeto com dados solicitados e testes dos métodos
 * implementados na classe
 * 
 * DESAFIO: É possível reescrever o método avaliarRecuperação apenas recebendo o valor
 * de notaAE, em seguida calcular a média e mostrar as mensagens Aprovado ou
 * Reprovado.
 * 
 */


public class Aluno {
	
	String nome;
	String matricula;
	float notaAV1;
	float notaAV2;
	float notaAE;
	String curso;
	int perido;
	
	Aluno(String nome, String matricula, float notaAV1, float notaAV2, float notaAE, String curso, int perido){
		
		this.nome = nome;
		this.matricula = matricula;
		this.notaAV1 = notaAV1;
		this.notaAV2 = notaAV2;
		this.notaAE = notaAE;
		this.curso = curso;
		this.perido = perido;
		
	}
	
	void alteraNotaAV1(float newNota){
		this.notaAV1 = newNota;	
	}
	
	void alteraNotaAV2(float newNota){
		this.notaAV2 = newNota;	
	}

	void alteraNotaAE(float newNota){
		this.notaAE = newNota;	
	}
	
	void avaliar(float n1, float n2) {
		float n3 = n1+n2;
		System.out.println(n3 >= 60 ? "Aluno Aprovado com: "+n3 : "Aluno Reprovado com; "+n3);	
	}
	
	void avaliarRecuperação(float n1, float n2, float ae) {
    //	float n4 = (n1+n2+ae)/2; 	(ACHO QUE NA NEWTON É DIVIDA A NOTA POR 2)
		float n4 = (n1+n2+ae)/3;  //(MAS VC FALA QUE É PARA FAZER A MÉDIA DAS 3 NOTAS)
		System.out.println(n4 >= 60 ? "Aluno Aprovado na AE com: "+n4 : "Aluno Reprovado na AE com; "+n4);	
	}
	
	void DESAFIO(float ae) {
		float n4 = (ae + this.notaAV1 + this.notaAV2) / 3;
		System.out.println(n4 >= 60 ? "Aluno Aprovado na AE com: "+n4 : "Aluno Reprovado na AE com; "+n4);
	}

}
