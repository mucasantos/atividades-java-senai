package system;

import java.util.Scanner;

import models.Aluno;

public class sistema {
	public static void main(String[] args) {
		
		
		/***
		 * 
		 * Atividade próxima aula, criar uma classe funcionario 
		 * 
		 * e criar as funcoes no sistema
		 * 
		 */
		
		Aluno chile = new Aluno("Chile@senaisp.com.br", "Jose Roberto", "11 97321-3241", "123", "nao");

		chile.getNome();
		System.out.println(chile.getNome());

		boolean opcao = false;

		Scanner sc = new Scanner(System.in);
		
		Aluno bruno = new Aluno(null, null, null, null, null);
		
		do {
			System.out.println("#################");
			System.out.println("Criar um usuario - 1");
			System.out.println("Ver o usuario - 2");
			System.out.println("Sair do sistema - 0");
			System.out.println("#################");
			int valor = sc.nextInt();
			
			if(valor == 1) {
				// criar o usuário
				System.out.println("Qual nome voce quer ?");
				String nome = sc.next();
				
				System.out.println("Qual email voce quer ?");
				String email = sc.next();
				
				System.out.println("Qual numero voce quer ?");
				String numero = sc.next();
				
				System.out.println("Qual a senha voce quer ?");
				String senha = sc.next();
				
				System.out.println("Qual a permissao ? => Nao tem permissao/Administrador/Usuario");
				String permissao = sc.next();
				
				bruno.setNome(nome);
				bruno.setEmail(email);
				bruno.setNumero(numero);
				bruno.setPermissao(permissao);
				bruno.setSenha(senha);
			} else if (valor == 2) {
				System.out.println("Aqui esta o usuario cadastrado");
				System.out.println("##############################");
				System.out.println("Email: " + bruno.getEmail());
				System.out.println("Nome: " + bruno.getNome());
				System.out.println("Permissao: " + bruno.getPermissao());
				System.out.println("Numero: " + bruno.getNumero());
				System.out.println("Senha: " + bruno.getSenha());
			} else if (valor == 0) {
				opcao = true;
			} else {
				continue;
			}
			
			
		} while (opcao != true);
		
	}
}
