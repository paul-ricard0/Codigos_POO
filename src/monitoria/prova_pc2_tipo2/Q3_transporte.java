package monitoria.prova_pc2_tipo2;

import java.util.Scanner;

public class Q3_transporte {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double valor;
		
		do{
			System.out.print("Valor ? ");
			valor = scan.nextInt();

			if (valor > 0){
				scan = new Scanner(System.in);
				System.out.print("\nperigosa - S ou N? ");
				String tipoCarga = scan.nextLine();

				System.out.print("\nT-Terrestre, F-Fluvial, A-Aéreo? ");
				String meio = scan.nextLine();
				scan.close();
				
				switch (tipoCarga.toUpperCase()){
				case "S": {
					if(meio.toUpperCase().equals("A")) {
						System.out.print("\n[Carga Perigosa] [Aéreo]");
						System.out.print("\n Imposto: "+valor*0.24);
						System.out.print("\n Seguro: "+valor/2);
					}else if(meio.toUpperCase().equals("T") || meio.toUpperCase().equals("F")){
						System.out.print("\n[Carga Perigosa] [Terrestre/Fluvial]");
						System.out.print("\n Imposto: "+valor*0.04);
						System.out.print("\n Seguro: "+valor*0.1);
					}else {
						System.out.println("\nMEIO DE TRANSPORTE INVALIDO!!");
					}
					break;
				}
				case "N": {
					if(meio.toUpperCase().equals("A")) {
						System.out.print("\n[Carga Tranquila] [Aéreo]");
						System.out.print("\n Imposto: "+valor*0.14);
						System.out.print("\n Seguro: "+valor*(1/3));
					}else if(meio.toUpperCase().equals("T") || meio.toUpperCase().equals("F")){
						System.out.print("\n[Carga Tranquila] [Terrestre/Fluvial]");
						System.out.print("\n Imposto: "+valor*0.05);
						System.out.print("\n Seguro: "+valor*0.05);
					}else {
						System.out.println("\nMEIO DE TRANSPORTE INVALIDO!!");
					}
					break;
				}
				default:
					throw new IllegalArgumentException("TIPO DE CARGA INVALIDA");
				}
			}else {
				System.out.println("\nVALOR INVALIDO!!");
			}
			
		}while(valor <= 0);
		
	}

}
