package models;

import java.util.ArrayList;

public class GestaoEstudante {
	private ArrayList<Estudante> listaEstudantes = null;
	private ArrayList<Materia> listaMaterias = null;
	
	public GestaoEstudante() {
		this.listaEstudantes = new ArrayList<Estudante>();
		this.listaMaterias = new ArrayList<Materia>();
	}
	
	
	public void adicionarEstudante(Estudante estudante) {
		// adicionando o estudante
		this.listaEstudantes.add(estudante);
	}
	
	public void adicionarMateria(Materia materia) {
		// adicionando a materia
		this.listaMaterias.add(materia);
	}
	
	
	// getters and setters

	public ArrayList<Estudante> getListaEstudantes() {
		return listaEstudantes;
	}

	public void setListaEstudantes(ArrayList<Estudante> listaEstudantes) {
		this.listaEstudantes = listaEstudantes;
	}

	public ArrayList<Materia> getListaMaterias() {
		return listaMaterias;
	}

	public void setListaMaterias(ArrayList<Materia> listaMaterias) {
		this.listaMaterias = listaMaterias;
	}
	
}
