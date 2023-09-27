package models;

public class User {
	private String email;
	private String senha;
	private String nome;
	private String numero;

	public User(String email, String nome, String senha, String numero) {
		this.email = email;
		this.senha = senha;
		this.nome = nome;
		this.numero = numero;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getEmail() {
		return email;
	}

	public String getNome() {
		return nome;
	}

	public String getNumero() {
		return numero;
	}

	public String getSenha() {
		return senha;
	}
}
