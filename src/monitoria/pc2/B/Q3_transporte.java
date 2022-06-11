package monitoria.pc2.B;
import java.util.Scanner;

/*
 * Calcular o valor do imposto e seguro de um determinado produto, de acordo com a
 * carga (perigosa - S ou N) e o meio de transporte utilizado (T-Terrestre, F-Fluvial, A-Aéreo).
 * O programa deverá solicitar o preço do produto, tipo de carga e meio de transporte.
 * Siga as instruções abaixo:
 * O programa deverá garantir que o preço do produto seja maior do que zero para iniciar a
 * solicitação do tipo de transporte e sobre carga (perigosa - S ou N).
 * Se a carga for perigosa (S) e a origem for A-Aéreo deverá mostrar o imposto de 24% e o seguro
 * referente a metade do preço.
 * Se a carga for perigosa (N) e a origem for A-Aéreo deverá mostrar o imposto de 14% e o seguro
 * referente a um terço do preço.
 * Se a origem for T-Terrestre ou F-Fluvial deverá mostrar o imposto de 4% e o seguro referente
 * 10% do preço.
 * Todos os demais casos, o imposto será de 5% e o seguro de 5%.
 */

public class Q3_transporte {

	public static void main(String[] args) {
		
		double valor;
		String tipoCarga, meio;
		
		Scanner scan = new Scanner(System.in);
		
		do{
			System.out.print("Valor ? ");
			valor = scan.nextInt();

			if (valor > 0){
				scan = new Scanner(System.in);
				System.out.print("\nperigosa - S ou N? ");
				tipoCarga = scan.nextLine();

				System.out.print("\nT-Terrestre, F-Fluvial, A-Aéreo? ");
				meio = scan.nextLine();
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
