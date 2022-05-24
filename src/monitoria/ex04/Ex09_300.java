package monitoria.ex04;

public class Ex09_300 {

	public static void main(String[] args) {
		
		int dia, mes, ano;
		
		
		dia = 31;
		mes = 6;
		
		System.out.println(validarData(dia, mes));
		
	}
	
	
	static boolean validarData(int dia, int mes) {
		
		if ((mes >= 1) && (mes <= 12)) { //Validando o mês
			
			switch (mes) {
				case 1, 3, 5, 7, 8, 10, 12:  //Mês 31 dias
					
					if (dia >=1 && dia <= 31) {
						return true;
					}
					else {
						return false;
					}
				
				case 4, 6, 9, 11: //Mês 30 dias
					
					if (dia >= 1  && dia <= 30) {
						return true;
					}
					else {
						return false;
						
					}
				
				case 2: //Fevereiro
					
					if (dia >= 1  && dia <= 28){
						return true;
					}
					else {
						return false;
						
					}
					
				default:
					throw new IllegalArgumentException("Unexpected value: " + mes);
			}
		}
		
		return false;
	}

}
