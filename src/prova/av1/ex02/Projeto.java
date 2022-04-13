package prova.av1.ex02;

public abstract class Projeto {
	
	private String nomeProjeto;
	private String descricao;
	private String endereco;
	private String dataInicio;
	private String dataFim;
	
	Projeto(String descricao, String endereco, String dataInicio, String dataFim){	
		this.descricao = descricao;
		this.endereco = endereco;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		
				
	};
	
	abstract public boolean validarProjeto(String nomeProjeto);
	
	abstract public String imprimeProjeto();

	public String getNomeProjeto() {
		return nomeProjeto;
	}

	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}
	
	
}
