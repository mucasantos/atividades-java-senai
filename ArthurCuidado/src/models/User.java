package models;

public class User {
	
	private String senha;
	private String nome;
	private String numero;

	private String email;

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}	
	
	
	public User(String email, String nome, String senha, String numero) {
		this.email = email;
		this.senha = senha;
		this.nome = nome;
		this.numero = numero;
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
