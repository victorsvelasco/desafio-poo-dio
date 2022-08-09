import java.util.Date;

import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

public class Main {
	public static void main(String[] args) {
		
		Curso curso1 = new Curso("curso java", "descrição curso java", 8);
	
		Curso curso2 = new Curso("curso js", "descrição curso js", 4);
		
		Mentoria mentoria = new Mentoria("mentoria Java", "descrição mentoria Java" , new Date());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setName("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devVictor = new Dev();
		devVictor.setNome("Victor Sampaio");
		devVictor.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Victor " + devVictor.getConteudoInscritos());
		devVictor.progredir();
		devVictor.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Incritos Victor " + devVictor.getConteudoInscritos());		
		System.out.println("Conteúdos Concluidos Victor " + devVictor.getConteudoConcluidos());
		System.out.println("XP: " + devVictor.calcularTotalXp());
		System.out.println("-----------------");
		
		Dev devAna = new Dev();
		devAna.setNome("Ana Flávia");
		devAna.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Incritos Ana " + devAna.getConteudoInscritos());
		devAna.progredir();
		devAna.progredir();
		devAna.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Incritos Ana " + devAna.getConteudoInscritos());		
		System.out.println("Conteúdos Concluidos Ana " + devAna.getConteudoConcluidos());	
		System.out.println("XP: " + devAna.calcularTotalXp());
	}
}
