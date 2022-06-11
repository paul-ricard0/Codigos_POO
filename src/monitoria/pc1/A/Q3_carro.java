package monitoria.pc1.A;

import java.util.Scanner;

/*
 * Escreva um algoritmo que leia a placa de um carro com no
 * máximo 7 caracteres e o ano de fabricação. Em seguida, validar a situação do carro:
 * Se o ano estiver entre 2004 e 2014 imprimir: Carro Velho
 * Se o ano estiver entre 2014 e 2021 imprimir: Carro Semi-novo
 * Se o ano for igual ou superior a 2022 imprimir: Carro Novo
 * Outros casos imprimir: Carro muito Velho
 * Posteriormente, o programa deverá substituir as vogais (a, e, i o e u – maiúscula e
 * minúscula) da placa pelo caractere *, e em seguida imprimir a placa.
 */
public class Q3_carro {

	public static void main(String[] args) {
		
		int ano;
		String placa;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual ano do carro? ");
		ano = scan.nextInt();
		
		
		do {
			System.out.println("Qual a placa do carro? ");
			placa = scan.nextLine();
			scan.close();
			
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
