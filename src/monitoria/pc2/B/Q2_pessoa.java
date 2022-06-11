package monitoria.pc2.B;

public class Q2_pessoa {
	
	private String nome;
	private String sobrenome;
	private String telefone;
	private int idade;
	
	public Q2_pessoa(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void assinatura(){
		System.out.print(this.getNome()+ " " +this.getSobrenome());
	}
	
	
}
