package monitoria.prova_pc2_tipo2;

public class Q1_mensalidade {
	private double mensalidade;
	private int qtd_irmao;

	public Q1_mensalidade(double mensalidade, int qtd_irmao) {
		super();
		this.mensalidade = mensalidade;
		this.qtd_irmao = qtd_irmao;
	}
	public double getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}
	public int getQtd_irmao() {
		return qtd_irmao;
	}
	public void setQtd_irmao(int qtd_irmao) {
		this.qtd_irmao = qtd_irmao;
	}
	
	public void calculaMensalidade(){
		if(this.qtd_irmao==1) {
			this.mensalidade = this.mensalidade * 0.95;
		}else if(this.qtd_irmao==2) {
			this.mensalidade = this.mensalidade * 0.9;
		}else if(this.qtd_irmao>2) {
			this.mensalidade = this.mensalidade * 0.85;
		}
	}
}
