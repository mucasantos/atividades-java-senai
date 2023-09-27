package atividade;

public class Ingresso {
	private String nome;
	private String CPF;
	int preco = 50;

	public Ingresso() {
	}

	public Ingresso(String nome, String CPF, int preco) {
		this.nome = nome;
		this.CPF = CPF;
		this.preco = preco;
	}

	public Ingresso(int preco) {
		this.preco = preco;
	}

	public Ingresso(String nome, String CPF) {
		this.nome = nome;
		this.CPF = CPF;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public String toString() {
		return "Informações do ingresso: " + "\nNome: " + nome + "\nCPF: " + CPF + "\nTotal pista padrão R$: " + preco;
	}
}
