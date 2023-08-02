package dominio;

public abstract class Conteudo {
	//	Todo bootcamp tera conteudos, cursos e mentorias são conteudos
	
	public static final double XP_PADRAO = 10d;
	
	
	protected String titulo;
	protected String descricao;
	
	public abstract double calcularXp();

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
	
	
}

//6:00