package system;

import models.Aluno;

public class main {

	public static void main(String[] args) {
		Aluno roberto = new Aluno("Roberto", "50543688826", 1213, "matricula");
		
		roberto.getNome();
	
		System.out.println(roberto.getCpf());
		System.out.println("GEldaspl");
	}

}
