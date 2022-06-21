package prova.av2.ex2;

public class AlunoEnem {
	private int id_aluno;
	private String nome;
	private int ano;
	
	public AlunoEnem(int id_aluno, String nome, int ano) {
		super();
		this.id_aluno = id_aluno;
		this.nome = nome;
		this.ano = ano;
	}

	public int getId_aluno() {
		return id_aluno;
	}

	public void setId_aluno(int id_aluno) {
		this.id_aluno = id_aluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	
}
