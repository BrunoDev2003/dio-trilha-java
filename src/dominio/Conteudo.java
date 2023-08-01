package dominio;

public abstract class Conteudo {
	//	Todo bootcamp tera conteudos, cursos e mentorias são conteudos
	
	public static final double XP_PADRAO = 10d;
	
	
	private String titulo;
	private String descricao;
	
	public abstract double calcularXp();
}

//6:00