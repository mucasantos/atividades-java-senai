package application;

public class Jaula {
	String nome;
	Animal animal;

	public Jaula() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Jaula(String nome, Animal animal) {
		super();
		this.nome = nome;
		this.animal = animal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
}
