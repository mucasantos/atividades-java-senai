package models;

public class Aluno extends User {
	private String permissao;
	
	public Aluno(String email, String nome, String numero, String senha, String permissao) {
		super(email, nome, numero, senha);
		
		this.permissao = permissao;
	}
	
	public String getPermissao() {
		return permissao;
	}
	
	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}
}
