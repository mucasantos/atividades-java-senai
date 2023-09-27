package models;

public class Aluno extends Pessoa {

	public String matricula;
	public int nia; // numero identificador do aluno

	public Aluno(String nome, String cpf, int nia, String matricula) {
		super(nome, cpf);
		this.matricula = matricula;

		this.nia = nia;

	}

	public String getMatricula() {
		return matricula;
	}

	public int getNia() {
		return nia;
	}
}
