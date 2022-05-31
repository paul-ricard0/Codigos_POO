package monitoria.ex06file;

public class ProjetoSocial {
	
	private String titulo;
	private String objetivo;
	private String endereco;
	private String dataInicio;
	private String status;
	
	
	
	
	
	
	public ProjetoSocial() {
		super();
	}
	public ProjetoSocial(String titulo, String objetivo, String endereco, String dataInicio, String status) {
		super();
		this.titulo = titulo;
		this.objetivo = objetivo;
		this.endereco = endereco;
		this.dataInicio = dataInicio;
		this.status = status;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getObjetivo() {
		return objetivo;
	}
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
}
