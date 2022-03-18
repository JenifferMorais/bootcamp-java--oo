
import java.time.LocalDate;

import br.com.dio.bootcamp.dominio.Bootcamp;
import br.com.dio.bootcamp.dominio.Curso;
import br.com.dio.bootcamp.dominio.Dev;
import br.com.dio.bootcamp.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descrição curso js");
		curso2.setCargaHoraria(4);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());


		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setName("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);

		Dev devJeni = new Dev();
		devJeni.setNome("Camila");
		devJeni.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Jeniffer:" + devJeni.getConteudosInscritos());
		devJeni.progredir();
		devJeni.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos Jeniffer:" + devJeni.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos Jeniffer:" + devJeni.getConteudosConcluidos());
		System.out.println("XP:" + devJeni.calcularTotalXp());

		System.out.println("-------");

		Dev devJoao = new Dev();
		devJoao.setNome("Joao");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
		System.out.println("XP:" + devJoao.calcularTotalXp());

	}
}