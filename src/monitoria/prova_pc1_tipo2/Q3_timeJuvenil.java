package monitoria.prova_pc1_tipo2;

import java.util.Scanner;

public class Q3_timeJuvenil {

	public static void main(String[] args) {
		int idade, sexo;
		double altura;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Seu sexo? ");
		sexo = scan.nextInt();  
		
		System.out.println("Sua idade? ");
		idade = scan.nextInt();  
		
		System.out.println("Sua altura? ");
		altura = scan.nextInt();  
		scan.close();

	}

}
