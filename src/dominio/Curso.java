package dominio;

public class Curso {
	private String titulo;
	private String descricao;
	private int carga_horaria;
	
	
	
	
	public Curso() {
		super();
		
	}
	
	public void Mentoria() {
		
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCarga_horaria() {
		return carga_horaria;
	}
	public void setCarga_horaria(int i) {
		this.carga_horaria = i; 
	}
	@Override
	public String toString() {
		return "Curso [titulo=" + titulo + ", descricao=" + descricao + ", carga_horaria=" + carga_horaria + "]";
	}
	
	
}
