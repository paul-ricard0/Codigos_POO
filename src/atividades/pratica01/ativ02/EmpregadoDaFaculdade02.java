package atividades.pratica01.ativ02;

/*
 * a) Alterar o método getGastos() para somar um bônus de R$ 40 reais por hora/aula.
 * b) Alterar o método getInfo () para retornar atualizado o valor que o professor irá
 * receber (salário + bônus).
 * c) Criar no Void main() um objeto e exibir na tela os resultados dos métodos
 * getGastos() e getInfo () 
 * 
 */

public class EmpregadoDaFaculdade02 {
	
	public String nome;
	public double salario;
	public int horasAula;
	
	EmpregadoDaFaculdade02(String nome, int salario, int horasAula) {
		this.nome = nome;
		this.salario = salario;
		this.horasAula = horasAula; 
	}

	double getBonus(){
		return 40 * horasAula;
	}
	
	String getNewSalario(){
		return "nome:" + this.nome + " com salário " + (this.salario + getBonus());
	}
	

}
