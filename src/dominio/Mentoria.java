package dominio;

public class Mentoria extends Conteudo {
	private String titulo;
	private String descricao;
	private int cargaHoraria;
	public String getTitulo() {
		return titulo;
	}
	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return 0;
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
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria; 
	}
	@Override
	public String toString() {
		return "Mentoria [titulo=" + titulo + ", "
				+ "descricao=" + descricao + getDescricao() + "\""
				+ cargaHoraria + "]";
	}
	public void setCarga_horaria(int i) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
}

//6:19