package dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class bootcamp {
	private String nome;
	private String descricao;
	private LocalDate dataInicial = LocalDate.now();
	private LocalDate dataFinal = dataInicial.plusDays(45);
	private Set<dev> devsInscritos = new HashSet<>();
	private Set<Conteudo> conteudos = new LinkedHashSet<>();
}
