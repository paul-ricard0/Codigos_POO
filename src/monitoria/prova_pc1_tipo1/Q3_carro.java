package monitoria.prova_pc1_tipo1;

import java.util.Scanner;

public class Q3_carro {

	public static void main(String[] args) {
		
		int ano;
		String placa;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual ano do carro? ");
		ano = scan.nextInt();
		
		scan = new Scanner(System.in);
		do {
			System.out.println("Qual a placa do carro? ");
			placa = scan.nextLine();
			
			if(placa.length()<=7) {
				
				placa = placa.replaceAll("[AEIOUaeiou]", "*");
			
				if(ano<2004) {
					System.out.println("Carro muito Velho | "+ placa);
				}else if(ano<2014) {
					System.out.println("Carro velho | "+ placa);
				}else if(ano<2021) {
					System.out.println("Carro semi-novo | "+ placa);
				}else {
					System.out.println("Carro novo | "+ placa);
				}
				
			}else {
				System.out.println("No máximo 7 letras/numeros!!!");
			}

		}while(placa.length()>7);
	}

}
