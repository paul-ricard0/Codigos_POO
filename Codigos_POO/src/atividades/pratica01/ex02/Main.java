package atividades.pratica01.ex02;

/*
 * a) Alterar o m�todo getGastos() para somar um b�nus de R$ 40 reais por hora/aula.
 * b) Alterar o m�todo getInfo () para retornar atualizado o valor que o professor ir�
 * receber (sal�rio + b�nus).
 * c) Criar no Void main() um objeto e exibir na tela os resultados dos m�todos
 * getGastos() e getInfo () 
 * 
 */

public class Main {

	public static void main(String[] args) {
		
		EmpregadoDaFaculdade02 professor = new EmpregadoDaFaculdade02("Paulo", 1000, 2);
		
		var bonus = professor.getBonus();
		var salario = professor.getNewSalario();
		
		System.out.println("Bonus de "+ bonus + " e seu sal�rio ser� " + salario);
	}

}
