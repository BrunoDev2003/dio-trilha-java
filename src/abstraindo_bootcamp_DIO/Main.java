package abstraindo_bootcamp_DIO;

import dominio.Conteudo;
import dominio.Curso;
import dominio.Mentoria;
import dominio.bootcamp;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso Java");
		curso1.setDescricao("descrição curso java");
		curso1.setCarga_horaria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso C++");
		curso2.setDescricao("curso do C++");
		curso2.setCarga_horaria(8);
		
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("curso C++");
		mentoria.setDescricao("curso do C++");
		mentoria.setCarga_horaria(8);
		
		bootcamp bootcamp = new bootcamp();
		bootcamp.setNome("Javeiro");
		bootcamp.setDescricao("Descrição Bootcamp Java Dev");
		bootcamp.getConteudos().add(mentoria);
		
	}
}
