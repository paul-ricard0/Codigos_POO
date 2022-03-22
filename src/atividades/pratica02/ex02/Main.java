package atividades.pratica02.ex02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("investimeto inicial: ");
		Double inicial = scan.nextDouble();
		
		System.out.println("taxa de rendimento: ");
		Double taxa = scan.nextDouble();
		
		
		System.out.println("Número de mês: ");
		Double mes = scan.nextDouble();
		
		Redimentos investimento = new Redimentos(inicial, taxa, mes);
		
		System.out.println("Rendimento toal: "+	investimento.rendimento());
		

	}

}
