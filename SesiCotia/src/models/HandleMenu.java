package models;

import java.util.ArrayList;
import java.util.Scanner;

public class HandleMenu {
	
	private GestaoEstudante gs;
	
	public HandleMenu(GestaoEstudante gs) {
		this.gs = gs;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void showMenu() {
		System.out.println("1 - Criar");
		System.out.println("2 - Visualizar");
		System.out.println("3 - Configuracoes");
		System.out.println("0 - Sair");
	}
	
	public void processUserInput(int userInput) {
		switch (userInput) {
		case 1: 
			System.out.println("1 - Criar um novo Estudante");
			System.out.println("2 - Criar Nova Materia");
			criacaoDeServicos(sc.nextInt());
			break;
		case 2:
			System.out.println("1 - Visualizar todos os Estudantes");
			System.out.println("2 - Visualizar todas as Materias");
			System.out.println("3 - Visualizar quem Passou");
			System.out.println("4 - Visualizar todas as Notas");
			visualizarServicos(sc.nextInt());
			break;
		case 3: 
			break;
		case 0:
			System.exit(0);
			break;
		default:
			System.out.println("Digite novamente - Valor invalido");
			break;
		}
	}
	
	
	
	public void visualizarServicos(int userInput) {
		switch (userInput) {
		case 1:
			
			ArrayList<Estudante> estudantes = gs.getListaEstudantes();
			
			System.out.println("###############################");
			// ! = ao contrario
			// isEmpty == é vazio ? true : false
			if(!(estudantes.isEmpty())) {
				estudantes.forEach(estudante -> {
					System.out.println("Nome: " + estudante.getNome() + " Idade: " + estudante.getIdade());
				});
			} else {
				System.out.println("Sem estudantes cadastrados");
			}
			System.out.println("###############################");
			break;
		case 2:
			ArrayList<Materia> materias = gs.getListaMaterias();
			
			System.out.println("###############################");
			if(!(materias.isEmpty())) {
				materias.forEach(materia -> {
					System.out.println("Nome da Materia: " + materia.getNome());
				});
			} else {
				System.out.println("Sem materias cadastrados");
			}
			System.out.println("###############################");
			break;
		case 3:
			break;
		case 4:
			break;
		default:
			break;
		}
	}
	
	
	
	
	
	
	// Criacao de servicos
	public void criacaoDeServicos(int userInput) {
		switch (userInput) {
		case 1:
			// Criar Estudante
			Estudante est = new Estudante();
			
			System.out.println("Qual o nome do Estudante ?");
			est.setNome(sc.next());
			
			System.out.println("Qual a idade do Estudante ?");
			est.setIdade(sc.nextInt());
			
			// adicionar na lista o estudante
			gs.adicionarEstudante(est);
			break;
		case 2:
			// Criar Materia
			Materia materia = new Materia();
			
			System.out.println("Digite o nome da Materia ?");
			materia.setNome(sc.next());
			
			gs.adicionarMateria(materia);
			break;
		default:
			break;
		}
	}
	
}
