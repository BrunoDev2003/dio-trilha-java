package dominio;

public class Curso {
	private String titulo;
	private String descricao;
	private String carga_horaria;
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
	public String getCarga_horaria() {
		return carga_horaria;
	}
	public void setCarga_horaria(String carga_horaria) {
		this.carga_horaria = carga_horaria;
	}
	@Override
	public String toString() {
		return "Curso [titulo=" + titulo + ", descricao=" + descricao + ", carga_horaria=" + carga_horaria + "]";
	}
	
	
}
