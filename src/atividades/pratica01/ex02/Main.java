package atividades.pratica01.ex02;

/*
 * a) Alterar o método getGastos() para somar um bônus de R$ 40 reais por hora/aula.
 * b) Alterar o método getInfo () para retornar atualizado o valor que o professor irá
 * receber (salário + bônus).
 * c) Criar no Void main() um objeto e exibir na tela os resultados dos métodos
 * getGastos() e getInfo () 
 * 
 */

public class Main {

	public static void main(String[] args) {
		
		EmpregadoDaFaculdade02 professor = new EmpregadoDaFaculdade02("Paulo", 1000, 2);
		
		var bonus = professor.getBonus();
		var salario = professor.getNewSalario();
		
		System.out.println("Bonus de "+ bonus + " e seu salário será " + salario);
	}

}
