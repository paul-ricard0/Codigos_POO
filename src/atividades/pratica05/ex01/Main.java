package atividades.pratica05.ex01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa[] vetorPessoa = new Pessoa[5];
		
		for(int i=0; i < vetorPessoa.length ; i++){
			
			vetorPessoa[i] = new Pessoa("Paulo0", 100, 200, 20);
			
			System.out.println(vetorPessoa[i].getInfo());
			
			
			vetorPessoa[i].niver();
			vetorPessoa[i].niver();
			
			System.out.println(vetorPessoa[i].getIdade());
		}
		
		
		
		/**********************************************************/
		Empresa[] vetorEmpresa = new Empresa[5];
		
		for(int i=0; i < vetorEmpresa.length ; i++){
			
			vetorEmpresa[i] = new Empresa("Paulo0", "xxx", vetorPessoa.length);
			
		}
		
		
		
		/**********************************************************/
		Funcionario func01 = new Funcionario("Paulo0", "dp", 200, "janeiro", "121", true);
		Funcionario func02 = new Funcionario("Ricard", "dp", 300, "marco", "222", false);
		
		
		
		
		
		
	}

}
