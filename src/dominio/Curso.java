package dominio;

public class Curso extends Conteudo {

	private int carga_horaria;
	
	
	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO + carga_horaria;
	}
	
	
	public Curso() {
		super();
		
	}
	
	public void Mentoria() {
		
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
