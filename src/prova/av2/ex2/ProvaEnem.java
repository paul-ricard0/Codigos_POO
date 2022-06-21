package prova.av2.ex2;

public class ProvaEnem {

	private int id_prova;
	private String titulo;
	private int nota;
	
	public ProvaEnem(int id_prova, String titulo, int nota) {
		super();
		this.id_prova = id_prova;
		this.titulo = titulo;
		this.nota = nota;
	}
	public int getId_prova() {
		return id_prova;
	}
	public void setId_prova(int id_prova) {
		this.id_prova = id_prova;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	
	
	
	
	
}
