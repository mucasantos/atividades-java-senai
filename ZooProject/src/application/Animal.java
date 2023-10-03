package application;

public abstract class Animal {
	
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	private String nome;
	private int idade;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	public abstract void emiteSom();
	public abstract void acao();

}
