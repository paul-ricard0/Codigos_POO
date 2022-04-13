package prova.av1.ex02;

public class DistribuicaoAlimento extends Projeto{
	private String descAlimento;
	private String qtde;
	
	DistribuicaoAlimento(String descAlimento, String qtde, String descricao, String endereco, String dataInicio, String dataFim){
		super( descricao,endereco, dataInicio, dataFim);
		this.descAlimento = descAlimento;
		this.qtde = qtde;
	};
	
	public boolean validarProjeto(String nomeProjeto) {
		setNomeProjeto(nomeProjeto);
		if(getDataFim() == null) {
			return true;
		}
		return false;
	};
	
	public String imprimeProjeto() {
		return getNomeProjeto() +"\n"+ getDescricao() +"\n"+ getDataInicio() +"\n"+ getDataFim() +"\n"+ getDescAlimento() +"\n"+ getQtde();
	}

	public String getDescAlimento() {
		return descAlimento;
	}

	public void setDescAlimento(String descAlimento) {
		this.descAlimento = descAlimento;
	}

	public String getQtde() {
		return qtde;
	}

	public void setQtde(String qtde) {
		this.qtde = qtde;
	};
	
	
}
