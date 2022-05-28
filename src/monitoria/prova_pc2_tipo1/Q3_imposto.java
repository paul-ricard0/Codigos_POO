package monitoria.prova_pc2_tipo1;

import java.util.Scanner;

public class Q3_imposto {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = scan.nextLine();
		
		System.out.print("\nPessoa F�sica[1] Pessoa Jur�dica[2}: ");
		int tipo = scan.nextInt();
		
		
		System.out.print("\nRenda: ");
		double renda = scan.nextFloat();
		
		switch (tipo) {
			case 1: {
				System.out.print("\nValor a ser pago: "+ (renda * 0.1));
				System.out.print("\nValor renda l�quida: "+ (renda * 0.9));
				break;
			}
			case 2: {
				if(renda<1903.98) {
					System.out.print("\nValor a ser pago: 0");
					System.out.print("\nValor renda l�quida: "+ renda);
				}else if(renda<2826.65) {
					System.out.print("\nValor a ser pago: 142.80");
					System.out.print("\nValor renda l�quida: "+ (renda * 142.80));
				}else if(renda<3751.05) {
					System.out.print("\nValor a ser pago: 354.80");
					System.out.print("\nValor renda l�quida: "+ (renda * 354.80));
				}else if(renda<4664.68) {
					System.out.print("\nValor a ser pago: 636.13");
					System.out.print("\nValor renda l�quida: "+ (renda * 636.13));
				}else{
					System.out.print("\nValor a ser pago: 869.36");
					System.out.print("\nValor renda l�quida: "+ (renda * 869.36));
				}
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + tipo);
		}
		
	}
	
}
