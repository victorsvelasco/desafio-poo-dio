import java.util.Date;

import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

public class Main {
	public static void main(String[] args) {
		
		Curso curso1 = new Curso("curso java", "descri��o curso java", 8);
	
		Curso curso2 = new Curso("curso js", "descri��o curso js", 4);
		
		Mentoria mentoria = new Mentoria("mentoria Java", "descri��o mentoria Java" , new Date());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setName("Bootcamp Java Developer");
		bootcamp.setDescricao("Descri��o Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devVictor = new Dev();
		devVictor.setNome("Victor Sampaio");
		devVictor.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos Inscritos Victor " + devVictor.getConteudoInscritos());
		devVictor.progredir();
		devVictor.progredir();
		System.out.println("-");
		System.out.println("Conte�dos Incritos Victor " + devVictor.getConteudoInscritos());		
		System.out.println("Conte�dos Concluidos Victor " + devVictor.getConteudoConcluidos());
		System.out.println("XP: " + devVictor.calcularTotalXp());
		System.out.println("-----------------");
		
		Dev devAna = new Dev();
		devAna.setNome("Ana Fl�via");
		devAna.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos Incritos Ana " + devAna.getConteudoInscritos());
		devAna.progredir();
		devAna.progredir();
		devAna.progredir();
		System.out.println("-");
		System.out.println("Conte�dos Incritos Ana " + devAna.getConteudoInscritos());		
		System.out.println("Conte�dos Concluidos Ana " + devAna.getConteudoConcluidos());	
		System.out.println("XP: " + devAna.calcularTotalXp());
	}
}
