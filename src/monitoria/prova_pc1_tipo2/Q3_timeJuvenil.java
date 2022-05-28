package monitoria.prova_pc1_tipo2;

import java.util.Scanner;

/*
 * Escreva um algoritmo que leia a idade de um candidato e a
 * altura (em cm) e sexo (Feminino=1 e Masculino=2). Em seguida, validar a situação
 * da pessoa:
 * Se a altura for maior ou igual a 180 cm e a idade for superior a 16 anos e sexo for igual
 * a 1 (Feminino) imprimir a mensagem: apto a jogar no time Feminino Juvenil de
 * Basquete.
 * Se a altura for maior ou igual a 180 cm e a idade for superior a 16 anos e sexo for igual
 * a 2 (Masculino) imprimir a mensagem: apto a jogar no time Masculino Juvenil de
 * Basquete.
 * Outros casos imprimir: Não apto.
 * */


public class Q3_timeJuvenil {

	public static void main(String[] args) {
		int idade, sexo;
		double altura;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Seu sexo? ");
		sexo = scan.nextInt();  
		
		System.out.println("Sua idade? ");
		idade = scan.nextInt();  
		scan.close();
		
		System.out.println("Sua altura? ");
		altura = scan.nextInt();  
		
		if(altura>=150 && idade>16 && sexo==1) {
			System.out.println("Apto a jogar no time FEMININO Juvenil de Basquete");
		}else if(altura>=150 && idade>16 && sexo==2) {
			System.out.println("Apto a jogar no time MASCULINO Juvenil de Basquete");
		}else {
			System.out.println("NÃO APTO!");
		}
		
		
		

	}

}
