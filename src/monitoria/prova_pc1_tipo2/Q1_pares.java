package monitoria.prova_pc1_tipo2;

/*
 * Escreva um algoritmo que imprime os n�meros pares de 1
 * at� 50, separados por linha
 * */

public class Q1_pares {
	public static void main(String[] args) {
		
		for(int i=0; i<=50; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
}
