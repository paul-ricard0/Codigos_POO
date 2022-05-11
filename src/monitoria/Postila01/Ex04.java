package monitoria.Postila01;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		int segundos, horas;
		double minutos, resto;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite os segundos");
		segundos = scan.nextInt();
		
		
		horas = segundos / 3600;
		resto = segundos % 3600;
		minutos = resto / 60;
		resto = resto % 60;
		
		System.out.println("Digite os segundos");

	}

}
