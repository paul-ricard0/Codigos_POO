package prova.av1.ex02;

public class TrabalhoVoluntario  extends Projeto {
	
	private String tipoTrabalho;
	private int duracaotrabalho;
	
	TrabalhoVoluntario(String desctrabalho, int qtde, String descricao, String endereco, String dataInicio, String dataFim){
		super( descricao,endereco, dataInicio, dataFim);
		this.tipoTrabalho = desctrabalho;
		this.duracaotrabalho = qtde;
	};
	
	
	public boolean validarProjeto(String nomeProjeto) {
		setNomeProjeto(nomeProjeto);
		if(getDuracaotrabalho() > 2) {
			return true;
		}
		return false;
	};
	
	public String imprimeProjeto() {
		;
		return getNomeProjeto() +"\n"+ getDescricao() +"\n"+ getDataInicio() +"\n"+ getDataFim() +"\n"+ getTipoTrabalho() +"\n"+ getDuracaotrabalho();
	}

	public String getTipoTrabalho() {
		return tipoTrabalho;
	}

	public void setTipoTrabalho(String tipoTrabalho) {
		this.tipoTrabalho = tipoTrabalho;
	}

	public int getDuracaotrabalho() {
		return duracaotrabalho;
	}

	public void setDuracaotrabalho(int duracaotrabalho) {
		this.duracaotrabalho = duracaotrabalho;
	};
	
	
}
