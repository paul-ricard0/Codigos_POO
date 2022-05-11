package atividades.pratica05.ex01;

public class Main {

	public static void main(String[] args) {
		
		/*
		Pessoa[] vetorPessoa = new Pessoa[5];
		
		for(int i=0; i < vetorPessoa.length ; i++){
			
			vetorPessoa[i] = new Pessoa("Paulo0", 100, 200, 20);
			
			System.out.println(vetorPessoa[i].getInfo());
			
			
			vetorPessoa[i].niver();
			vetorPessoa[i].niver();
			
			System.out.println(vetorPessoa[i].getIdade());
		}
		
		
		
		Funcionario func01 = new Funcionario("Paulo0", "dp", 200, "janeiro", "121");
		
		Empresa[] vetorEmpresa = new Empresa[5];
		
		for(int i=0; i < vetorEmpresa.length ; i++){
			vetorEmpresa[i] = new Empresa("Paulo0", "xxx", func01);
		}
		*/
		
		// ( 43 )
		Empresa Riot = new Empresa("Paulo0", "Lolzin");
		
		Funcionario Paulo = new Funcionario("PauloRicardo", "desenvolvimento", 15000, "janeiro", "121");
		Funcionario Maria = new Funcionario("Maria", "RH", 2000, "agosto", "0009");
		Funcionario Joao = new Funcionario("Joao", "Dados", 30000, "janeiro", "913292");
		
		Riot.contratar(Paulo);
		Riot.contratar(Maria);
		Riot.contratar(Joao);
		
		System.out.println("Total de funcionario pos contratar: "+Riot.numDeFunc());
		
		Riot.demitir(Paulo);
		Riot.demitir(Joao);
		
		System.out.println("Total de funcionario depois de demitir: "+Riot.numDeFunc());
		
	}

}
