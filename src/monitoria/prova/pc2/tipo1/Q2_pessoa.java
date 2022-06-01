package monitoria.prova.pc2.tipo1;

public class Q2_pessoa {
	
	private String nome;
	private String sobremone;
	
	public Q2_pessoa(String nome, String sobremone) {
		super();
		this.nome = nome;
		this.sobremone = sobremone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobremone() {
		return sobremone;
	}
	public void setSobremone(String sobremone) {
		this.sobremone = sobremone;
	}
	
	public void assinatura(){
		System.out.print(this.getNome()+ " " +this.getSobremone());
	}

}
