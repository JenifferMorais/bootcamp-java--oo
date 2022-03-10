package br.com.dio.bootcamp;

public class Main {

	public static void main(String[] args) {
		Curso curso = new Curso();
		curso.setTitulo("curso java");
		curso.setDescricao("Descricao curso java");
		curso.setCargaHoraria(8);
		
		Curso curso1 = new Curso();
		curso1.setTitulo("curso js");
		curso1.setDescricao("Descricao curso js");
		curso1.setCargaHoraria(4);
		
		System.out.println(curso);
		System.out.println(curso1);
		
		Mentoria mentoria = new Mentoria();

	}

}
