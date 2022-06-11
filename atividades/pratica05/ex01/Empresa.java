package atividades.pratica05.ex01;

public class Empresa {
	
	public static int cont = 0;
	
	private String nome;
	private String cnpj;
	private int qtd_func=0;
	private Funcionario func;
	
	public Empresa(String nome, String cnpj, Funcionario newFunc) {
		cont++;
		
		this.func = newFunc;
		this.func.setContratado(true);
		
		this.nome = nome;
		this.cnpj = cnpj;
		this.qtd_func = cont;
	}


	public Empresa(String nome, String cnpj) {
		this.qtd_func=cont;
		this.nome = nome;
		this.cnpj = cnpj;
	}
	
	public void contratar(Funcionario newFunc) {
		cont++;
		
		this.func = newFunc;
		this.func.setContratado(true);
		this.qtd_func=cont;
	}
	
	public void demitir(Funcionario oldFunc) {
		cont--;
		
		this.qtd_func=cont;
		oldFunc.setContratado(false);
	}
	
	public int numDeFunc() {
		return this.qtd_func;
	}
	
	
}
